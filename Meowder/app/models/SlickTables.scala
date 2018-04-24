package models

object Tables extends {
  val profile = slick.jdbc.MySQLProfile
  import profile.api._
  
  
  class Users(tag: Tag) extends Table[User](tag, "user") {
    def username = column[String]("username")
    def password = column[String]("password")
    def * = (username, password) <> (User.tupled, User.unapply)
    
    
  }
  
  val users = TableQuery[Users]
  
  
  
  class Tasks(tag: Tag) extends Table[Task](tag, "task") {
    def id = column[Int]("id")
    def taskname = column[String]("taskname")
    def * = (id, taskname) <> (Task.tupled, Task.unapply)
  }
  val tasks = TableQuery[Tasks]
  
  
  
  
  
  
  
}
