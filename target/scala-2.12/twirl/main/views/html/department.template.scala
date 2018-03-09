
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departments: List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

"""),_display_(/*3.2*/main("Departments",user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.1*/("""<p class="lead">Our Departments</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Code</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*25.6*/for(c<-departments) yield /*25.25*/ {_display_(Seq[Any](format.raw/*25.27*/("""
      """),format.raw/*26.7*/("""<tr>
        <td class="numeric">"""),_display_(/*27.30*/c/*27.31*/.getId),format.raw/*27.37*/("""</td>
        <td>"""),_display_(/*28.14*/c/*28.15*/.getName),format.raw/*28.23*/("""</td>
        <td>"""),_display_(/*29.14*/c/*29.15*/.getCode),format.raw/*29.23*/("""</td>
        <td>
          <a href=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.updateDepartment(c.getId)),format.raw/*31.68*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.deleteDepartment(c.getId)),format.raw/*36.68*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*41.6*/("""
  """),format.raw/*42.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*46.13*/routes/*46.19*/.HomeController.addDepartment()),format.raw/*46.50*/("""">
    <button class="btn btn-primary">Add a Department</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(departments:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departments,user)

  def f:((List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departments,user) => apply(departments,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 22:24:25 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/SDEV4Lab2Play-modif pornit/app/views/department.scala.html
                  HASH: 05b93b1ef6e00e50b4f56b7c66c589b9c7706582
                  MATRIX: 988->1|1146->64|1174->67|1206->91|1245->93|1273->95|1336->133|1376->165|1415->167|1444->170|1508->209|1521->214|1556->229|1586->232|1624->240|1653->242|1893->456|1928->475|1968->477|2002->484|2063->518|2073->519|2100->525|2146->544|2156->545|2185->553|2231->572|2241->573|2270->581|2336->620|2351->626|2413->667|2597->824|2612->830|2674->871|2873->1040|2903->1043|2965->1078|2980->1084|3032->1115
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|63->31|63->31|68->36|68->36|68->36|73->41|74->42|78->46|78->46|78->46
                  -- GENERATED --
              */
          