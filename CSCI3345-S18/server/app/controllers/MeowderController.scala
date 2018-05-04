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
case class NewCat(catname:String, ownername:String, breed:String, gender:String)
case class Login(email:String, password:String)

@Singleton
class MeowderController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {
  
//  val newUserForm = Form(mapping(
//    "username" -> nonEmptyText,
//    "password" -> nonEmptyText,
//    "sexuality" -> nonEmptyText,
//    "gender" -> nonEmptyText,
//    "catFact" -> nonEmptyText)(NewUser.apply)(NewUser.unapply))
    
  val newUserForm = Form(mapping(
    "username" -> nonEmptyText,
    "email" -> nonEmptyText,
    "password" -> nonEmptyText)(NewUser.apply)(NewUser.unapply))
    
  val newCatForm = Form(mapping(
    "catname" -> nonEmptyText,
    "ownername" -> nonEmptyText,
    "breed" -> nonEmptyText,
    "gender" -> nonEmptyText)(NewCat.apply)(NewCat.unapply))
    
  val loginForm = Form(mapping(
    "email" -> nonEmptyText,
    "password" -> nonEmptyText,
    )(Login.apply)(Login.unapply))
  
  def datingSite = Action { implicit request =>
    Ok(views.html.datingApp())
  }
  
  def almostDone = Action { implicit request =>
    Ok(views.html.almostDone())
  }
  
  def createAccount = Action { implicit request =>
    Ok(views.html.createAccount("", newUserForm))
  }
  
  def userProfile = Action { implicit request =>
    Ok(views.html.profile())
  }
  
  def login = Action { implicit request =>
    Console.println("Sign in button clicked")
    Ok(views.html.meowderLogin((loginForm)))
  }
  
  //[TODO] Need to edit almostDone so it'll keep FirstName and transfer it to createAccount Pagr
  def addUser = Action.async { implicit request =>
    Console.println("inside addUser")
    newUserForm.bindFromRequest().fold(
      formWithErrors => {
        Console.println("sooo am i here")
        val Future = MeowderQueries.allUsers(db)
        Future.map(books => BadRequest(views.html.createAccount("", newUserForm)))
      },
      newUser => {
        Console.println("Right after new user")
        val addFuture = MeowderQueries.addUser(newUser, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.MeowderController.createAccount).flashing("message" -> "Your account has been created!")
          else Redirect(routes.MeowderController.createAccount).flashing("error" -> "Failed to creat your account...")
        }
      })
  }
  
  def verify = Action.async { implicit request =>
    Console.println("inside login")
    loginForm.bindFromRequest().fold(
      formWithErrors => {
        val usersFuture = MeowderQueries.allUsers(db)
        usersFuture.map(users => BadRequest(views.html.meowderLogin(loginForm)))
      },
      newUser => {
        val verifyFuture = MeowderQueries.verify(newUser.email, newUser.password, db)
        verifyFuture.flatMap { user =>
          if(user.nonEmpty == true){
           //[TODO]Change here after the profile page is created!!
           val usersFuture = MeowderQueries.findUserByEmail(newUser.email, db)
           usersFuture.map(users => Ok(views.html.profile()))
          }else{
          val Future = MeowderQueries.allUsers(db)
          Future.map(books => BadRequest(views.html.datingApp()))
          }
        }
      })
   }
  
  def ageCheck = Action.async { implicit request =>
    Console.println("inside addUser")
    newUserForm.bindFromRequest().fold(
      formWithErrors => {
        Console.println("sooo am i here")
        val Future = MeowderQueries.allUsers(db)
        Future.map(books => BadRequest(views.html.createAccount("", newUserForm)))
      },
      newUser => {
        Console.println("Right after new user")
        val addFuture = MeowderQueries.addUser(newUser, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.MeowderController.createAccount).flashing("message" -> "Your account has been created!")
          else Redirect(routes.MeowderController.createAccount).flashing("error" -> "Failed to creat your account...")
        }
      })
  }
}