
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object taskTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[scala.collection.mutable.Buffer[String],String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* tempTable Template File */
  def apply/*2.2*/(tasks: scala.collection.mutable.Buffer[String], user: String)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Tasks Table")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
  """),format.raw/*5.3*/("""<h2>To Do List!</h2>
  <h2>Currently logged in as """),_display_(/*6.31*/user),format.raw/*6.35*/("""</h2>
  
  <table>
  	<tr>
  	  """),format.raw/*10.39*/("""
  	  """),format.raw/*11.6*/("""<th>Task</th>
  	  <form id="table-form" action=""""),_display_(/*12.37*/routes/*12.43*/.TaskController.createTask),format.raw/*12.69*/("""" method="POST">
  	  	"""),_display_(/*13.8*/helper/*13.14*/.CSRF.formField),format.raw/*13.29*/("""
  	  	"""),format.raw/*14.7*/("""Task to Do:<input type="text" name="newTask">
  	  	<input type="submit" value="Add Task">
  	  	</form>
  	</tr>
	


  </table>
  <table border="3">
  	"""),_display_(/*23.5*/for(t <- tasks) yield /*23.20*/ {_display_(Seq[Any](format.raw/*23.22*/("""
  	  """),format.raw/*24.6*/("""<tr>
  	  	<form id="table-form" action=""""),_display_(/*25.38*/routes/*25.44*/.TaskController.deleteTask),format.raw/*25.70*/("""" method="POST">
  	  	"""),_display_(/*26.8*/helper/*26.14*/.CSRF.formField),format.raw/*26.29*/("""
  	  	"""),format.raw/*27.7*/("""<td>"""),_display_(/*27.12*/t),format.raw/*27.13*/("""</td>
  	  	<td><input type="submit" value="Delete"></td>
  	  	<input type="hidden" name="markedTask" value="""),_display_(/*29.53*/t),format.raw/*29.54*/(""">
  	  	</form>
  	  </tr>
  	""")))}),format.raw/*32.5*/("""
  """),format.raw/*33.3*/("""</table>
	<form id="table-form" action=""""),_display_(/*34.33*/routes/*34.39*/.TaskController.logout),format.raw/*34.61*/("""" method="GET">
		"""),_display_(/*35.4*/helper/*35.10*/.CSRF.formField),format.raw/*35.25*/("""
		"""),format.raw/*36.3*/("""<input type ="submit" value="Logout">
	</form>
	


""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(tasks:scala.collection.mutable.Buffer[String],user:String,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tasks,user)(request)

  def f:((scala.collection.mutable.Buffer[String],String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tasks,user) => (request) => apply(tasks,user)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 22:19:11 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/taskTable.scala.html
                  HASH: a21de3cb1769f167b1b3a4d70181eaac3f51d158
                  MATRIX: 820->31|1017->135|1044->137|1071->156|1110->158|1139->161|1216->212|1240->216|1300->281|1333->287|1410->337|1425->343|1472->369|1522->393|1537->399|1573->414|1607->421|1787->575|1818->590|1858->592|1891->598|1960->640|1975->646|2022->672|2072->696|2087->702|2123->717|2157->724|2189->729|2211->730|2348->840|2370->841|2431->872|2461->875|2529->916|2544->922|2587->944|2632->963|2647->969|2683->984|2713->987|2795->1039
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|29->6|29->6|33->10|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|46->23|46->23|46->23|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|52->29|52->29|55->32|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|64->41
                  -- GENERATED --
              */
          