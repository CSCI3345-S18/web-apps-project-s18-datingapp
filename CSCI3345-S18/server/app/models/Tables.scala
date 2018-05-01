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
    def password = column[String]("password")
    def sexuality = column[String]("sexuality")
    def gender = column[String]("gender")
    def isMatched = column[Boolean]("isMatched")
    def catFact = column[String]("catFact")
    def * = (username, password, sexuality, gender, isMatched, catFact) <> (User.tupled, User.unapply)
  }
  
  class Cats(tag:Tag) extends Table[Cat](tag, "cat"){
    def catname = column[String]("catname")
    def ownername = column[String]("ownername")
    def breed = column[String]("breed")
    def gender = column[String]("gender")
    def * = (catname, ownername, breed, gender) <> (Cat.tupled, Cat.unapply)
  }
}
