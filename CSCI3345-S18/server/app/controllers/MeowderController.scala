package controllers

import javax.inject._
import java.util.concurrent.atomic.AtomicInteger
import play.api.mvc._
import play.api.libs.json.Writes
import play.api.libs.json.Json
import play.api.libs.json.Reads
import play.api.libs.json.JsPath
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import java.util.concurrent.atomic.AtomicReference

import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import models.MeowderQueries
import scala.concurrent.ExecutionContext
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future
import Console._



//case class NewUser(username: String, password:String, sexuality:String, gender:String, catFact:String)
case class NewUser(username: String, email: String, password:String)
case class NewCat(catname:String, ownername:String, owneremail: String, breed:String, gender:String)
case class Login(username: String, email:String, password:String)
case class AgeCheck(month: Int, day:Int, year:Int)
case class Profile(catFact: String)
case class MatchUsers(userone: String, usertwo: String)



@Singleton
class MeowderController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {
 
  val newUserForm = Form(mapping(
    "username" -> nonEmptyText,
    "email" -> nonEmptyText,
    "password" -> nonEmptyText)(NewUser.apply)(NewUser.unapply))
    
  val newCatForm = Form(mapping(
    "catname" -> nonEmptyText,
    "ownername" -> nonEmptyText,
    "owneremail" -> nonEmptyText,
    "breed" -> nonEmptyText,
    "gender" -> nonEmptyText)(NewCat.apply)(NewCat.unapply))
    
  val loginForm = Form(mapping(
    "username" -> nonEmptyText,
    "email" -> nonEmptyText,
    "password" -> nonEmptyText,
    )(Login.apply)(Login.unapply))
    
  val ageForm = Form(mapping(
        "month" -> number(min = 1, max = 12),
        "day" -> number(min = 1, max = 31),
        "year" -> number(min = 0, max = 2000)
    )(AgeCheck.apply)(AgeCheck.unapply))
    
  val profileForm = Form(mapping(
      "catFact" -> nonEmptyText)(Profile.apply)(Profile.unapply))
   
  val matchUsersForm = Form(mapping(
      "userone" -> nonEmptyText,
      "usertwo" -> nonEmptyText)(MatchUsers.apply)(MatchUsers.unapply))
      
  def datingSite = Action { implicit request =>
    Ok(views.html.datingApp())
  }
  
  def almostDone = Action { implicit request =>
    Ok(views.html.almostDone(ageForm))
  }
  
  def createAccount = Action { implicit request =>
    Ok(views.html.createAccount(newUserForm))
  }
  
  def login = Action { implicit request =>
    Console.println("Sign in button clicked")
    Ok(views.html.meowderLogin((loginForm)))
  }
  
  def catFeed(email: String) = Action.async { implicit request =>
    val feedFuture = MeowderQueries.allFacts(db)
    feedFuture.map(facts => Ok(views.html.catFeed(email, facts, matchUsersForm)))
  }
  
  def profile(username: String, email: String) = Action { implicit request =>
    Ok(views.html.profile(username, email, profileForm, newCatForm))
  }
  
  //[TODO] Need to edit almostDone so it'll keep FirstName and transfer it to createAccount Pagr
  def addUser = Action.async { implicit request =>
    Console.println("inside addUser")
    newUserForm.bindFromRequest().fold(
      formWithErrors => {
        Console.println("sooo am i here")
        val Future = MeowderQueries.allUsers(db)
        Future.map(books => BadRequest(views.html.createAccount(newUserForm)))
      },
      newUser => {
        Console.println("Right after new user")
        val addFuture = MeowderQueries.addUser(newUser, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.MeowderController.login).flashing("message" -> "Your account has been created!")
          else Redirect(routes.MeowderController.login).flashing("error" -> "Failed to create your account...")
        }
      })
  }
  
  def verify() = Action.async { implicit request =>
    Console.println("inside login")
    loginForm.bindFromRequest().fold(
      formWithErrors => {
        val usersFuture = MeowderQueries.allUsers(db)
        usersFuture.map(users => BadRequest(views.html.meowderLogin(formWithErrors)))
      },
      newUser => {
        val verifyFuture = MeowderQueries.verify(newUser.username, newUser.email, newUser.password, db)
        verifyFuture.flatMap { user =>
          if(user.nonEmpty == true){
           //[TODO]Change here after the profile page is created!!
           val usersFuture = MeowderQueries.findUserByEmail(newUser.email, db)
           usersFuture.map(users => Ok(views.html.profile(newUser.username, newUser.email, profileForm, newCatForm)))
          }else{
          val Future = MeowderQueries.allUsers(db)
          Future.map(books => Redirect(routes.MeowderController.login()).flashing("error" -> "Incorrect Username, Email or Password!"))
          }
        }
      })
   }
  
  def ageCheck = Action.async { implicit request =>
    Console.println("inside agecheck")
    ageForm.bindFromRequest().fold(
      formWithErrors => {
        Console.println("sooo am i here")
        val Future = MeowderQueries.allUsers(db)
        Future.map(users => BadRequest(views.html.almostDone(formWithErrors)))
      },
      ageUser => {
        Console.println("Right after age user")
        val Future = MeowderQueries.allCats("", db)
        Future.map { cnt =>
            Console.println("cnt =1")
            Redirect(routes.MeowderController.createAccount).flashing("message" -> "You are old enough to make an account!")
          }
      })
  }
  
  def addFact(username: String, email: String) = Action.async { implicit request =>
    profileForm.bindFromRequest().fold(
        formWithErrors => {
          val Future = MeowderQueries.allUsers(db)
          Future.map(facts => BadRequest(views.html.profile(username, email, formWithErrors, newCatForm)))
        },
        newFact => {
          val addFuture = MeowderQueries.addFact(email, Option(newFact.catFact), db)
          addFuture.map { cnt =>
          if (cnt == 1) Redirect(routes.MeowderController.profile(username, email)).flashing("message" -> "Meow! Fact Added.")
          else Redirect(routes.MeowderController.profile(username, email)).flashing("error" -> "Failed to add...")
          }
        })
  }

  def addCatInfo(username: String, email: String) = Action.async { implicit request =>
    newCatForm.bindFromRequest().fold(
        formWithErrors => { 
          val Future = MeowderQueries.allCats(username, db)
          Future.map(cats => BadRequest(views.html.profile(username,email, profileForm, formWithErrors)))
        },
        newCat => {
          val addFuture = MeowderQueries.addCat(newCat, db)
          addFuture.map { cnt =>
            if (cnt == 1) Redirect(routes.MeowderController.profile(username, email)).flashing("message" -> "Meow! Cat Information Added.")
            else Redirect(routes.MeowderController.profile(username, email)).flashing("error" -> "Failed to add...")
          }
        })
  }
  
  def listCatInfo(emailone: String, emailtwo: String) = Action.async { implicit request =>
    val viewFuture = MeowderQueries.findCatInfoByEmail(emailtwo, db)
    viewFuture.map { info =>
      if(info.nonEmpty == true) Ok(views.html.catInfo(info))
      else Ok(views.html.catInfo(info))
    }
        
  }
  
  def likeFact(userone: String, usertwo: String) = Action.async { implicit request => 
    matchUsersForm.bindFromRequest().fold(
        formWithErrors => {
          val Future = MeowderQueries.allFacts(db)
          Console.println("error")
          Future.map(facts => BadRequest(views.html.catFeed(userone, facts, formWithErrors)))
        },
        like => {
          if(like.userone == like.usertwo) {
            val Future = MeowderQueries.allCats("", db)
            Future.map { cnt =>
              Redirect(routes.MeowderController.catFeed(userone)).flashing("message" -> "You liked your own profile!?")
            }
          } else {
            val likeFuture = MeowderQueries.isLiked(usertwo, userone, db)
            likeFuture.map { isliked => 
              if (isliked.nonEmpty == true) {
                Console.println("liked")
                Redirect(routes.MeowderController.updateMatch(usertwo, userone))
              } else {
                val alreadyLikeFuture = MeowderQueries.isLiked(usertwo, userone, db)
                alreadyLikeFuture.map { alreadyLiked =>
                  if(alreadyLiked.nonEmpty == true) {
                    Redirect(routes.MeowderController.catFeed(userone))
                  } 
                }
                Redirect(routes.MeowderController.addMatch(userone, usertwo))
              }
            
             }
            
          }
        })
  }
  
  def updateMatch(userone: String, usertwo: String) = Action.async { implicit request => 
    val updateFuture = MeowderQueries.updateMatch(userone, usertwo, db)
    updateFuture.map { updated =>
      if (updated == 1) Redirect(routes.MeowderController.catFeed(userone))
      else Redirect(routes.MeowderController.catFeed(userone))
    }
  }
  
  def addMatch(userone: String, usertwo: String) = Action.async { implicit request =>
    val addFuture = MeowderQueries.addMatch(userone, usertwo, db)
    addFuture.map { matched =>
      if (matched == 1) Redirect(routes.MeowderController.catFeed(userone))
      else Redirect(routes.MeowderController.catFeed(userone))
    }
  }
  
  def viewMatches(username: String, email: String) = Action.async { implicit request =>
    val getMatchesFuture = MeowderQueries.viewMatches(email, db)
    getMatchesFuture.map { matches =>
      if (matches.nonEmpty == true) {
        Ok(views.html.matches(email, matches.distinct)) 
      }
      else Redirect(routes.MeowderController.profile(username, email)).flashing("error" -> "You currently don't have any matches.")
    }
  }
}