
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*17.8*/("""
    """),_display_(/*18.6*/welcome(message, style = "scala")),format.raw/*18.39*/("""

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(message:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message)(request)

  def f:((String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message) => (request) => apply(message)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 20:44:53 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/index.scala.html
                  HASH: d95621ea74e14ca3bae311a089706a0f51554b99
                  MATRIX: 832->95|976->146|1004->341|1032->343|1064->366|1104->368|1137->497|1169->503|1223->536|1256->539
                  LINES: 24->5|29->6|30->11|31->12|31->12|31->12|33->17|34->18|34->18|36->20
                  -- GENERATED --
              */
          