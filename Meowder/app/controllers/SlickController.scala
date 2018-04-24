package controllers

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import models.TaskQueries
import models.UserQueries
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future

case class NewUser(username: String, password: String)
case class NewTask(id: Int, taskname: String)


@Singleton
class SlickController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {

  
  val newUserForm = Form(
  mapping(
    "username" -> text,
    "password" -> nonEmptyText
    )(UserData.apply)(UserData.unapply))
 
  /*  
  def createUserPage = Action {implicit request =>   
    Ok(views.html.createUser(users, newUserForm))
  }
  * */
  
  
  /*
  def login = Action.async { implicit request =>
    
  }
*/
  
  
  
  
  
  
}
