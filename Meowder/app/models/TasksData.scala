package models

import scala.collection.mutable.Map
import scala.collection.mutable.Buffer
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future


case class Task(id: Int, taskname: String)


object TaskQueries {
  import Tables._
  
  def allBooks(db: Database)(implicit ec: ExecutionContext):Future[Seq[Task]] = {
    db.run(tasks.result)
  }
  
  
}