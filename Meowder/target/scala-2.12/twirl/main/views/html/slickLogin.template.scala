
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

object slickLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
@(users: Seq[User], userForm: Form[NewUser])(implicit request: MessagesRequestHeader, flash: Flash)
@main("Login page")
<head>
    <title>Login page for To Do List</title>
   
  </head>

  <h1>
    Please enter your login credentials
  </h1>
  
  	
  <form id="table-form" action="@routes.SlickController.login()" method="POST">
	  @helper.CSRF.formField
	  Username:<input type="text" name="username">
	  <br>
	  Password:<input type="password" name="password">
	  <input type="submit" value="Submit">
  </form>
	<br>
  <form action="@routes.SlickController.createUserPage" >
	<p>Don't have an existing account? Create one!</p>
	<input type="submit" value="Create">
	@*
	Username:<input type="text" name="username">
	<br>
	Password:<input type="password" name="password">
	<input type="submit" value="Create">*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 12 11:57:25 CDT 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/slickLogin.scala.html
                  HASH: e05f0fd54c2d53adbde679e6de29dd7e97916610
                  MATRIX: 
                  LINES: 
                  -- GENERATED --
              */
          