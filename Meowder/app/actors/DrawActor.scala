package actors

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorRef

class DrawActor(out: ActorRef, manager: ActorRef) extends Actor {
  
  manager ! DrawManager.NewCircle(self)
  
  import DrawActor._
  
  def receive = {
    case input: String =>
      manager ! DrawManager.BroadcastMessage(input)
    case ChatMessage(msg) => 
      out ! msg
    case m => 
      println("Got unknown message: "+m)
  }
  
  
}

object DrawActor {
  def props(out: ActorRef, manager: ActorRef) = Props(new DrawActor(out, manager))
  
  case class ChatMessage(msg: String)
}