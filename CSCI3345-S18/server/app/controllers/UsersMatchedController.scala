/*package controllers

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
import models.MeowderQueries

case class CatFact(fact: String)

@Singleton
class UsersMatchedController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {
  
    val catFactForm = Form(mapping(
    "fact" -> nonEmptyText)(CatFact.apply)(CatFact.unapply))
   
    
    def addFact(email: String) = Action.async { implicit request =>
    catFactForm.bindFromRequest().fold(
        formWithErrors => {
          val factFuture = MeowderQueries.allFacts(email, db)
          factFuture.map(facts => BadRequest(views.html.profile(email, facts, formWithErrors)))
        },
        newFact => {
          val addFuture = MeowderQueries.addFact(email, newFact, db)
          addFuture.map { cnt =>
            if(cnt == 1) {
              Redirect(routes.Task8Controller.viewTasks(username))
            }
            else {
              Redirect(routes.Task8Controller.viewTasks(username))
            }
          }
       })
    }
    /*def viewFeed(currUser: String) = Action.async { implicit request =>
      val feedFuture = MeowderQueries.allCatFacts(currUser, db) 
      feedFuture.map(feed => Ok(views.html.catFeed(currUser, feed, db))
    }
  
    def likeFact = Action.async { implicit request =>
      Console.println("liked")
      val likeFuture = MeowderQueries.isLiked(userone, usertwo, db)
      likeFuture.map { isMatched => 
        if (isMatched == true) Redirect(routes.UsersMatchedController.updateMatch())
        else Redirect(routes.UsersMatchedController.addMatch()) 
      }
   }
    
   def updateMatch(currUser: String) = Action.async { implicit request =>
     val updateFuture = MeowderQueries.updateMatch(currUser, usertwo, db)
     updateFuture.map { updated =>
       if (updated == 1) Redirect(routes.UsersMatchedController.viewFeed(currUser) 
       else Redirect(routes.UsersMatchedController.viewFeed(currUser))
     }
   }*/
   
  
}*/