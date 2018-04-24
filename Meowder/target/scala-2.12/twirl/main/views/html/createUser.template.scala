
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

object createUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[scala.collection.mutable.Map[String, String],Form[UserData],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: scala.collection.mutable.Map[String,String], userForm: Form[UserData])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Account Creation")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
  """),format.raw/*5.3*/("""<head>
    <title>Account Creation page for Tasks List</title>
    """),format.raw/*10.7*/("""
  """),format.raw/*11.3*/("""</head>

  <h1>
    Please create a new username and password!
  </h1>

  <form id="table-form" action=""""),_display_(/*17.34*/routes/*17.40*/.TaskController.createUser()),format.raw/*17.68*/("""" method="POST">
	  """),_display_(/*18.5*/helper/*18.11*/.CSRF.formField),format.raw/*18.26*/("""
	  """),format.raw/*19.4*/("""New Username:<input type="text" name="username">
	  <br>
	  New Password:<input type="password" name="password">
	  <input type="submit" value="Submit">
  </form>


""")))}),format.raw/*26.2*/("""
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
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/createUser.scala.html
                  HASH: 99776e213c65e9853e2c462f8d099d6678fbd3bc
                  MATRIX: 801->2|1006->114|1033->116|1065->140|1104->142|1133->145|1227->290|1257->293|1389->398|1404->404|1453->432|1500->453|1515->459|1551->474|1582->478|1778->644
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->10|31->11|37->17|37->17|37->17|38->18|38->18|38->18|39->19|46->26
                  -- GENERATED --
              */
          