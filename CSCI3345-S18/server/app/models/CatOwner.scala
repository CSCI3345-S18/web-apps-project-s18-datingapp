package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewUser
import controllers.NewCat

case class User(username: String, email:String, password:String, sexuality:Option[String], gender:Option[String], catFact:Option[String])
case class Cat(catname:String, ownername:String, breed:String, gender:String)
case class Matched(userone:String, usertwo:String, status:Int)

/**
 * Object that I can put some queries in.
 */
object MeowderQueries {
  import Tables._
  
  def allUsers(db: Database)(implicit ec: ExecutionContext):Future[Seq[User]] = {
    db.run(users.result)
  }
  
  def findUserByEmail(email: String, db: Database)(implicit ec: ExecutionContext): Future[Option[User]] = {
    db.run {
      users.filter(_.email === email).result.headOption
    }
  }
  
  //Needs to add NewUser & NewCat in a controller
  def addUser(nu: NewUser, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      users += User(nu.username, nu.email, nu.password, null, null, null)
    }
  }
  
  def addCat(nc: NewCat, db: Database)(implicit ec:ExecutionContext): Future[Int] = {
    db.run {
      cats += Cat(nc.catname, nc.ownername, nc.breed, nc.gender)
    }
  }
  
  
  //Add new match when userone like usertwo. 
  //We should run isLiked before doing addMatch to make sure usertwo hasn't liked userone. 
  def addMatch(userone: String, usertwo: String, db: Database)(implicit ec:ExecutionContext): Future[Int] = {
    db.run {
      matches += Matched(userone, usertwo, 0)
    }
  }
  
  //See if userone has liked usertwo already
  def isLiked(userone:String, usertwo: String, db: Database)(implicit ex:ExecutionContext):Future[Option[Matched]] = {
    db.run{
      matches.filter(m => m.userone === userone && m.usertwo === usertwo).result.headOption
    }
  }
  
  //Update status of the match when userone and usertwo liked each other. Change status from 0 -> 1.
  def updateMatch(userone:String, usertwo: String, db: Database)(implicit ex:ExecutionContext):Future[Int] = {
    db.run{
      matches.filter(m => m.userone === userone && m.usertwo === usertwo).map(_.status).update(1)
    }
  }
  
  //Return whether or not two uses are matched
  def isMatched(userone:String, usertwo: String, db: Database)(implicit ex:ExecutionContext):Future[Option[Matched]] = {
    db.run{
      matches.filter(m => 
        (m.userone === userone && m.usertwo === usertwo && m.status === 1) || 
        (m.userone === usertwo && m.usertwo === userone && m.status === 1)).result.headOption
    }
  }
  
  def verify(email: String, password: String, db: Database)(implicit ex:ExecutionContext):Future[Option[User]] = {
    db.run{
      users.filter(u => u.email === email && u.password === password).result.headOption
    }
  }
}