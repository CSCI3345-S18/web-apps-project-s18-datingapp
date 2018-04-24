
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

object createTask extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* createTask Template File */
  def apply/*2.2*/(tasklist: List[String])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Task Creation")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
	
	"""),format.raw/*6.2*/("""<form id="table-form" action=""""),_display_(/*6.33*/routes/*6.39*/.TaskController.createTask()),format.raw/*6.67*/("""" method="POST">
	Add a task:<input type="text" name="username"><input type="submit" value="Add Task">
	</form>
	
	
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(tasklist:List[String],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tasklist)(request)

  def f:((List[String]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tasklist) => (request) => apply(tasklist)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 04:32:44 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/createTask.scala.html
                  HASH: dde4b845f3e8c097e91633296b4f34cb3c727fc2
                  MATRIX: 788->32|947->98|974->100|1003->121|1042->123|1072->127|1129->158|1143->164|1191->192|1338->309
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|29->6|29->6|29->6|34->11
                  -- GENERATED --
              */
          