package actors

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorRef

class DrawManager extends Actor {
  import DrawManager._
  
  private var circles = List[ActorRef]()
  
  def receive = {
    case NewCircle(circle) =>
      circles ::= circle
    case BroadcastMessage(msg) =>
      circles.foreach(_ !DrawActor.ChatMessage(msg))
  }
}

object DrawManager {
  def props = Props[DrawManager]
  
  case class NewCircle(circle: ActorRef)
  case class BroadcastMessage(msg: String)
}