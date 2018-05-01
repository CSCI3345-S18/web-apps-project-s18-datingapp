package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewBook

case class User(username: String, password:String, sexuality:String, gender:String, isMatched:Boolean, catFact:String)
case class Cat(catname:String, ownername:String, breed:String, gender:String)

/**
 * Object that I can put some queries in.
 */
object MeowderQueries {
  import Tables._
  def allBooks(db: Database)(implicit ec: ExecutionContext):Future[Seq[Book]] = {
    db.run(books.result)
  }
  
  def findByISBN(isbn: String, db: Database)(implicit ec: ExecutionContext): Future[Option[Book]] = {
    db.run {
      books.filter(_.isbn === isbn).result.headOption
    }
  }
  
  def addBook(nb: NewBook, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      books += Book(nb.title, nb.isbn, nb.price.doubleValue())
    }
  }
}