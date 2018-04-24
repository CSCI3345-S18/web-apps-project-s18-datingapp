package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

case class User(username: String, password: String)



object UserQueries {
  import Tables._
  
  def allUsers(db: Database)(implicit ec: ExecutionContext):Future[Seq[User]] = {
    db.run(users.result)
  }
  
}