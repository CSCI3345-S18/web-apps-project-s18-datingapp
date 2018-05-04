/*package controllers

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import models.BookQueries
import scala.concurrent.ExecutionContext
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future

case class NewUser(username: String, password:String, sexuality:String, gender:String, catFact:String)
case class NewCat(catname:String, ownername:String, breed:String, gender:String)

@Singleton
class DatingAppController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {

  val newUserForm = Form(mapping(
    "username" -> nonEmptyText,
    "password" -> nonEmptyText,
    "sexuality" -> nonEmptyText,
    "gender" -> nonEmptyText,
    "catFact" -> nonEmptyText)(NewUser.apply)(NewUser.unapply))
    
  val newCatForm = Form(mapping(
    "catname" -> nonEmptyText,
    "ownername" -> nonEmptyText,
    "breed" -> nonEmptyText,
    "gender" -> nonEmptyText)(NewCat.apply)(NewCat.unapply))

  
}*/