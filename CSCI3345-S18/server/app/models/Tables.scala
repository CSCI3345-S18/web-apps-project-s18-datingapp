package models

object Tables {
  val profile = slick.jdbc.MySQLProfile
  import profile.api._
  
  class Books(tag: Tag) extends Table[Book](tag, "book") {
    def title = column[String]("title")
    def isbn = column[String]("isbn")
    def price = column[Double]("price")
    def * = (title, isbn, price) <> (Book.tupled, Book.unapply)
  }
  val books = TableQuery[Books]
  
  class Users(tag:Tag) extends Table[User](tag, "user"){
    def username = column[String]("username")
    def email = column[String]("email")
    def password = column[String]("password")
    def sexuality = column[Option[String]]("sexuality")
    def gender = column[Option[String]]("gender")
    def catFact = column[Option[String]]("catFact")
    def * = (username, email, password, sexuality, gender, catFact) <> (User.tupled, User.unapply)
  }
  val users = TableQuery[Users]
  
  class Cats(tag:Tag) extends Table[Cat](tag, "cat"){
    def catname = column[String]("catname")
    def ownername = column[String]("ownername")
    def owneremail = column[String]("owneremail")
    def breed = column[String]("breed")
    def gender = column[String]("gender")
    def * = (catname, ownername, owneremail, breed, gender) <> (Cat.tupled, Cat.unapply)
  }
  val cats = TableQuery[Cats]
  
  //status works in the following way....
  //0: user1 liked user2, but user2 hasn't liked user 1 yet :(
  //1: user2 also liked user1. Yay!
  class Matches(tag:Tag) extends Table[Matched](tag, "matched"){
    def userone = column[String]("userone")
    def usertwo = column[String]("usertwo")
    def status = column[Int]("status")
    def * = (userone, usertwo, status) <> (Matched.tupled, Matched.unapply)
  }
  val matches = TableQuery[Matches]
  
  class Chats(tag: Tag) extends Table[Chat](tag, "chat") {
    def id = column[Int]("id")
    def sender = column[Option[String]]("sender")
    def receiver = column[Option[String]]("receiver")
    def startDate = column[Option[String]]("startDate")
    def message = column[Option[String]]("message")
    def * = (id, sender, receiver, startDate, message) <> (Chat.tupled, Chat.unapply)   
  }
  val chats = TableQuery[Chats]
}
