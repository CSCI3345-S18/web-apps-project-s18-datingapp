
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

object tempWelcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[TempRange],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* tempWelcome Template File */
  def apply/*2.2*/(msg: String, tempRangeForm: Form[TempRange])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Temperatures")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
	"""),format.raw/*5.2*/("""<h2>Temperature Data</h2>
	<p>This should be a cool app in a few days.</p>
	<p>The message of the day is: """),_display_(/*7.33*/msg),format.raw/*7.36*/("""</p>
	
	<form id="table-form" action=""""),_display_(/*9.33*/routes/*9.39*/.TempController.tempTable()),format.raw/*9.66*/("""" method="POST">
	  """),_display_(/*10.5*/helper/*10.11*/.CSRF.formField),format.raw/*10.26*/("""
	  """),format.raw/*11.4*/("""Month:<input type="text" name="month">
	  Year:<input type="text" name="year">
	  <input type="submit" value="Submit">
	</form>
	
	"""),_display_(/*16.3*/helper/*16.9*/.form(action = helper.CSRF(routes.TempController.tempPlotPage()))/*16.74*/ {_display_(Seq[Any](format.raw/*16.76*/("""
	  """),_display_(/*17.5*/helper/*17.11*/.inputText(tempRangeForm("startMonth"))),format.raw/*17.50*/("""
	  """),_display_(/*18.5*/helper/*18.11*/.inputText(tempRangeForm("startYear"))),format.raw/*18.49*/("""
	  """),_display_(/*19.5*/helper/*19.11*/.inputText(tempRangeForm("endMonth"))),format.raw/*19.48*/("""
	  """),_display_(/*20.5*/helper/*20.11*/.inputText(tempRangeForm("endYear"))),format.raw/*20.47*/("""
	  """),format.raw/*21.4*/("""<input type="submit" value="Submit">
	""")))}),format.raw/*22.3*/("""
	
	"""),format.raw/*24.57*/("""
	"""),_display_(/*25.3*/defining(1+2)/*25.16*/ { sum =>_display_(Seq[Any](format.raw/*25.25*/("""
	  """),format.raw/*26.4*/("""<p>The sum is """),_display_(/*26.19*/sum),format.raw/*26.22*/(""".</p>
	  <p>Using """),_display_(/*27.14*/sum),format.raw/*27.17*/(""" """),format.raw/*27.18*/("""again.</p>
	""")))}),format.raw/*28.3*/("""
	"""),format.raw/*29.2*/("""<p>mlewis@trinity.edu</p>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(msg:String,tempRangeForm:Form[TempRange],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(msg,tempRangeForm)(request)

  def f:((String,Form[TempRange]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (msg,tempRangeForm) => (request) => apply(msg,tempRangeForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 07 20:44:52 CST 2018
                  SOURCE: /users/akim/Local/HTML-Documents/ScalaPlay/app/views/tempWelcome.scala.html
                  HASH: f6f423b9995bfc41da76c6f89ffee66e29780a08
                  MATRIX: 800->33|980->120|1007->122|1035->142|1074->144|1102->146|1235->253|1258->256|1323->295|1337->301|1384->328|1431->349|1446->355|1482->370|1513->374|1671->506|1685->512|1759->577|1799->579|1830->584|1845->590|1905->629|1936->634|1951->640|2010->678|2041->683|2056->689|2114->726|2145->731|2160->737|2217->773|2248->777|2317->816|2349->875|2378->878|2400->891|2447->900|2478->904|2520->919|2544->922|2590->941|2614->944|2643->945|2686->958|2715->960|2772->988
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|32->9|32->9|32->9|33->10|33->10|33->10|34->11|39->16|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|45->22|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|51->28|52->29|53->30
                  -- GENERATED --
              */
          