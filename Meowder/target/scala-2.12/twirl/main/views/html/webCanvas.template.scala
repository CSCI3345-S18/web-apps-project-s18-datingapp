
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

object webCanvas extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<head>
    <title>Austin Kim | Trinity University 2018 - Computer Science Major</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/website.css")),format.raw/*4.100*/("""">
    """),format.raw/*5.69*/("""
    """),format.raw/*6.5*/("""</style>
  </head>

"""),_display_(/*9.2*/main("Drawing Page")/*9.22*/ {_display_(Seq[Any](format.raw/*9.24*/("""
  

  """),format.raw/*12.3*/("""<body>
    <ul class="nav">
      <div class="logo">
        Austin Kim
      </div>

      <li><a href="index.html" class="hvr-grow">Home</a></li>
      <li><a href="AboutMe.html" class="hvr-grow">About Me</a></li>
      <li><a href="Tasks.html" class="hvr-grow">Tasks</a></li>
      <li><a href="Contact.html" class="hvr-grow" style="margin-right: 260px;">Contact</a></li>
    </ul>

    <p>Drawing with WebSockets!</p>
  	<div id="messages"></div>


    <canvas id="drawSpace" width="800" height="800" style="border:4px solid #000000;"></canvas>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("javascripts/draw.js")),format.raw/*29.65*/("""" type="text/javascript"></script>
  </body>
""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 31 23:52:27 CDT 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/webCanvas.scala.html
                  HASH: 8b06edc545d2f84bee2ac2ea46885deddb5a8b8f
                  MATRIX: 740->1|869->37|1032->174|1046->180|1111->224|1145->295|1176->300|1222->321|1250->341|1289->343|1323->350|1917->917|1932->923|1993->963
                  LINES: 21->1|26->2|28->4|28->4|28->4|29->5|30->6|33->9|33->9|33->9|36->12|53->29|53->29|53->29
                  -- GENERATED --
              */
          