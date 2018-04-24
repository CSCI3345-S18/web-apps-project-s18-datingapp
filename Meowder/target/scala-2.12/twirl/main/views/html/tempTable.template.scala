
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

object tempTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[DailyTemp],Int,Int,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* tempTable Template File */
  def apply/*2.2*/(tempData: Seq[DailyTemp], month: Int, year: Int)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(s"Temp Table: $month/$year")/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<h2>Table for """),_display_(/*5.18*/month),format.raw/*5.23*/("""/"""),_display_(/*5.25*/year),format.raw/*5.29*/("""</h2>
  <table border="1">
  	<tr>
  	  <th>Month</th>
  	  <th>Day</th>
  	  <th>Year</th>
  	  <th>Precip</th>
  	  <th>Average</th>
  	  <th>High</th>
  	  <th>Low</th>
  	</tr>
  	"""),_display_(/*16.5*/for(dt <- tempData) yield /*16.24*/ {_display_(Seq[Any](format.raw/*16.26*/("""
  	  """),format.raw/*17.6*/("""<tr>
  	    <td>"""),_display_(/*18.13*/dt/*18.15*/.month),format.raw/*18.21*/("""</td>
  	    <td>"""),_display_(/*19.13*/dt/*19.15*/.day),format.raw/*19.19*/("""</td>
  	    <td>"""),_display_(/*20.13*/dt/*20.15*/.year),format.raw/*20.20*/("""</td>
  	    <td>"""),_display_(/*21.13*/dt/*21.15*/.precip),format.raw/*21.22*/("""</td>
  	    <td>"""),_display_(/*22.13*/dt/*22.15*/.tave),format.raw/*22.20*/("""</td>
  	    <td>"""),_display_(/*23.13*/dt/*23.15*/.tmax),format.raw/*23.20*/("""</td>
  	    <td>"""),_display_(/*24.13*/dt/*24.15*/.tmin),format.raw/*24.20*/("""</td>
  	  </tr>
  	""")))}),format.raw/*26.5*/("""
  """),format.raw/*27.3*/("""</table>
  <p>Back to <a href="">Main Page</a>.</p>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(tempData:Seq[DailyTemp],month:Int,year:Int,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tempData,month,year)(request)

  def f:((Seq[DailyTemp],Int,Int) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tempData,month,year) => (request) => apply(tempData,month,year)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 21:09:39 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/tempTable.scala.html
                  HASH: 5a8af79ff0ad2ac1f932c87a03be1fc00623f88f
                  MATRIX: 788->31|964->114|991->116|1032->149|1071->151|1100->154|1141->169|1166->174|1194->176|1218->180|1429->365|1464->384|1504->386|1537->392|1581->409|1592->411|1619->417|1664->435|1675->437|1700->441|1745->459|1756->461|1782->466|1827->484|1838->486|1866->493|1911->511|1922->513|1948->518|1993->536|2004->538|2030->543|2075->561|2086->563|2112->568|2163->589|2193->592|2276->645
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|28->5|28->5|28->5|28->5|39->16|39->16|39->16|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|49->26|50->27|52->29
                  -- GENERATED --
              */
          