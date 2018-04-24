
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

object taskLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[scala.collection.mutable.Map[String, String],Form[UserData],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: scala.collection.mutable.Map[String,String], userForm: Form[UserData])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Login page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<head>
    <title>Login page for To Do List</title>
   
  </head>

  <h1>
    Please enter your login credentials
  </h1>
	
  <form id="table-form" action=""""),_display_(/*13.34*/routes/*13.40*/.TaskController.login()),format.raw/*13.63*/("""" method="POST">
	  """),_display_(/*14.5*/helper/*14.11*/.CSRF.formField),format.raw/*14.26*/("""
	  """),format.raw/*15.4*/("""Username:<input type="text" name="username">
	  <br>
	  Password:<input type="password" name="password">
	  <input type="submit" value="Submit">
  </form>
	<br>
  <form action=""""),_display_(/*21.18*/routes/*21.24*/.TaskController.createUserPage),format.raw/*21.54*/("""" >
	<p>Don't have an existing account? Create one!</p>
	<input type="submit" value="Create">
	"""),format.raw/*28.40*/("""

""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(users:scala.collection.mutable.Map[String, String],userForm:Form[UserData],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(users,userForm)(request)

  def f:((scala.collection.mutable.Map[String, String],Form[UserData]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (users,userForm) => (request) => apply(users,userForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 14:14:45 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/taskLogin.scala.html
                  HASH: fc5066485a0a7db1a656969563ad6a2dc763a482
                  MATRIX: 800->1|1005->113|1032->115|1058->133|1097->135|1126->138|1310->295|1325->301|1369->324|1416->345|1431->351|1467->366|1498->370|1703->548|1718->554|1769->584|1892->823|1925->826
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|37->13|37->13|37->13|38->14|38->14|38->14|39->15|45->21|45->21|45->21|48->28|50->30
                  -- GENERATED --
              */
          