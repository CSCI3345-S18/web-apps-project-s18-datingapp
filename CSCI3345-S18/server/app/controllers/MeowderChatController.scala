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

import akka.actor.ActorSystem
import akka.stream.Materializer
import javax.inject.Inject
import play.api.libs.streams.ActorFlow
import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.WebSocket
import actors.WSChatActor
import actors.WSChatManager

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

case class NewChat(id: Int, sender: String, receiver: String, startDate: String)
case class NewMessage(id: Int, chatid: Int, message: String, dateTime: String)

@Singleton
class MeowderChatController @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider,
    mcc: MessagesControllerComponents) (implicit system: ActorSystem, mat: Materializer, ec: ExecutionContext) extends MessagesAbstractController(mcc) 
    with HasDatabaseConfigProvider[JdbcProfile] {
  
  
  val wsManager = system.actorOf(WSChatManager.props)

  val newChatForm = Form(mapping(
      "id" -> number,
      "sender" -> nonEmptyText,
      "receiver" -> nonEmptyText,
      "startDate" -> nonEmptyText)(NewChat.apply)(NewChat.unapply))
  
  val messageForm = Form(mapping(
      "id" -> number,
      "chatid" -> number,
      "message" -> nonEmptyText,
      "dateTime" -> nonEmptyText)(NewMessage.apply)(NewMessage.unapply))
  
  def socket = WebSocket.accept[String, String] { request =>
    ActorFlow.actorRef { out =>
      WSChatActor.props(out, wsManager)
    }
  }
  
  def createChatPage = Action.async { implicit request =>
    request.session.get("connection").map { user =>
      MeowderQueries.getChats(user, db).map(chat => Ok(views.html.datingChat(user, chats, newChatForm)))
    }.get
  }
  
  
  
  def addChat(sender: String, receiver: String) = Action.async { implicit request =>
    newChatForm.bindFromRequest().fold(
        formWithErrors => {
          val Future = MeowderQueries.allChats(db)
          Future.map(chats => BadRequest(views.html.datingChat(sender,chats, formWithErrors)))
        },
        newChat => {
          val addFuture = MeowderQueries.addChat(newChat, db)
          addFuture.map { cnt =>
            if(cnt == 1) Redirect(routes.MeowderChatController.createChatPage).withSession("connection" -> sender)
            else Redirect(routes.MeowderChatController.createChatPage).flashing("error" -> "Error creating task")
          }
        })
  }
  
  
  
}