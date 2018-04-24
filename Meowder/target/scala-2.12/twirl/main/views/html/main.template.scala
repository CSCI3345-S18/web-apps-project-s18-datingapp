
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import views.html.helper.CSRF


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*10.1*/("""
"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        
    </head>
    <body """),format.raw/*24.32*/("""
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
    """),format.raw/*26.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request)

  def f:((String) => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request) => apply(title)(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 21:56:25 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/main.scala.html
                  HASH: 33a1ad12fcac992d2b7ad082f189dc264e7524bf
                  MATRIX: 1001->260|1137->326|1195->324|1223->356|1251->357|1331->462|1367->471|1402->479|1428->484|1517->546|1532->552|1595->593|1683->654|1698->660|1759->699|1811->724|1826->730|1888->771|2079->1069|2116->1079|2144->1086|2176->1091
                  LINES: 26->7|29->9|32->8|33->10|34->11|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|45->24|46->25|46->25|47->26
                  -- GENERATED --
              */
          