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

//case class NewUser(username: String, password:String, sexuality:String, gender:String, catFact:String)
case class NewUser(username: String, email: String, password:String)
case class NewCat(catname:String, ownername:String, breed:String, gender:String)

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
    "password" -> nonEmptyText,
    "email" -> nonEmptyText)(NewUser.apply)(NewUser.unapply))
    
  val newCatForm = Form(mapping(
    "catname" -> nonEmptyText,
    "ownername" -> nonEmptyText,
    "breed" -> nonEmptyText,
    "gender" -> nonEmptyText)(NewCat.apply)(NewCat.unapply))
  
  def datingSite = Action { implicit request =>
    Ok(views.html.datingApp())
  }
  
  def almostDone = Action { implicit request =>
    Ok(views.html.almostDone())
  }
  
  def createAccount = Action { implicit request =>
    Ok(views.html.createAccount())
  }
  
  def addUser = Action.async { implicit request =>
    newUserForm.bindFromRequest().fold(
      formWithErrors => {
        val Future = MeowderQueries.allBooks(db)
        Future.map(books => BadRequest(views.html.createAccount()))
      },
      newUser => {
        val addFuture = MeowderQueries.addUser(newUser, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.MeowderController.createAccount).flashing("message" -> "Your account has been created!")
          else Redirect(routes.MeowderController.createAccount).flashing("error" -> "Failed to creat your account...")
        }
      })
  }
  
  //Need to add arguments in datingApp.scala.html
  def login = Action.async { implicit request =>
    Console.println("inside login")
    newUserForm.bindFromRequest().fold(
      formWithErrors => {
        val usersFuture = MeowderQueries.allBooks(db)
        usersFuture.map(users => BadRequest(views.html.datingApp(/*newUserForm*/)))
      },
      newUser => {
        val verifyFuture = MeowderQueries.login(newUser.email, newUser.password, db)
        verifyFuture.flatMap { user =>
          if(user.nonEmpty == true){
           //[TODO]Change here after the profile page is created!!
           val tasksFuture = MeowderQueries.allBooks(db)
           tasksFuture.map(tasks => Ok(views.html.datingApp()))
          }else{
          val Future = MeowderQueries.allBooks(db)
          Future.map(books => BadRequest(views.html.datingApp()))
          }
        }
      })
   }
}