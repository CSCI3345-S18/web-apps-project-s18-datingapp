
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

object tempPlot extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[TempRange,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* tempPlot Template File */
  def apply/*2.2*/(tempRange: TempRange)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(s"Plots for ${tempRange.startMonth}/${tempRange.startYear} to ${tempRange.endMonth}/${tempRange.endYear}")/*4.113*/ {_display_(Seq[Any](format.raw/*4.115*/("""
  """),format.raw/*5.3*/("""<h2>Data for """),_display_(/*5.17*/{tempRange.startMonth}),format.raw/*5.39*/("""/"""),_display_(/*5.41*/{tempRange.startYear}),format.raw/*5.62*/(""" """),format.raw/*5.63*/("""to """),_display_(/*5.67*/{tempRange.endMonth}),format.raw/*5.87*/("""/"""),_display_(/*5.89*/{tempRange.endYear}),format.raw/*5.108*/("""</h2>
  <img src=""""),_display_(/*6.14*/routes/*6.20*/.TempController.tempPlot(tempRange.startMonth, tempRange.startYear, tempRange.endMonth, tempRange.endYear)),format.raw/*6.126*/("""" width="800" height="600"/>
  <img src=""""),_display_(/*7.14*/routes/*7.20*/.TempController.precipPlot(tempRange.startMonth, tempRange.startYear, tempRange.endMonth, tempRange.endYear)),format.raw/*7.128*/("""" width="800" height="600"/>
""")))}),format.raw/*8.2*/(""" 
"""))
      }
    }
  }

  def render(tempRange:TempRange,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tempRange)(request)

  def f:((TempRange) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tempRange) => (request) => apply(tempRange)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 20:44:53 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/tempPlot.scala.html
                  HASH: 7e3f1cd7d632dd0ea440a3b5c693642ab1f38d1b
                  MATRIX: 773->30|922->86|949->88|1069->199|1109->201|1138->204|1178->218|1220->240|1248->242|1289->263|1317->264|1347->268|1387->288|1415->290|1455->309|1500->328|1514->334|1641->440|1709->482|1723->488|1852->596|1911->626
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|28->5|28->5|28->5|28->5|28->5|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|31->8
                  -- GENERATED --
              */
          