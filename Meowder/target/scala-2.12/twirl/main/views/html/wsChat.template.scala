
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

object wsChat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* wsChat Template File */
  def apply/*2.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("WebSocket Chatting!")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""
  """),format.raw/*5.3*/("""<h2>Chat via WebSockets</h2>
  <input type="text" id="input"></input>
  <div id="messages"></div>
""")))}),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("javascripts/wschat.js")),format.raw/*10.63*/("""" type="text/javascript"></script>"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 20:44:53 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/wsChat.scala.html
                  HASH: 7424a65bf167abb526aeb7b086b32b9bd1683a89
                  MATRIX: 759->28|888->64|915->66|950->93|989->95|1018->98|1146->197|1175->199|1216->213|1231->219|1294->261
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|31->8|33->10|33->10|33->10|33->10
                  -- GENERATED --
              */
          