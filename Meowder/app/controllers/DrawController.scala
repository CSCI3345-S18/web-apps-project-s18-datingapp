package controllers

import akka.actor.ActorSystem
import akka.stream.Materializer
import javax.inject.Inject
import play.api.libs.streams.ActorFlow
import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.WebSocket
import actors.DrawActor
import actors.DrawManager
import scala.collection.mutable.ArrayBuffer

class DrawController @Inject() (cc: ControllerComponents) (implicit system: ActorSystem, mat: Materializer) extends AbstractController(cc) {
  //var users: ArrayBuffer[String] 
  
  val wsManager = system.actorOf(DrawManager.props)
  
  def index = Action { implicit request =>
    Ok(views.html.webCanvas())
  }
  
  def socket = WebSocket.accept[String, String] { request =>
    ActorFlow.actorRef { out =>
      DrawActor.props(out, wsManager)
    }
  }
}