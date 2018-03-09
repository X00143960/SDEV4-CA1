
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

object employeeDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Employee,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Employee,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("Full Image", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*7.8*/if(flash.containsKey("success"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th>
          <th>Salary</th>
          <th>Address</th>
          <th>Start Date</th>
          <th>Department</th>
          <th colspan="2"></th>
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*27.16*/if(env.resource("public/images/employeeImages/" + p.getId + ".jpg").isDefined)/*27.94*/ {_display_(Seq[Any](format.raw/*27.96*/("""
                """),format.raw/*28.17*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*28.62*/(p.getId + ".jpg")),format.raw/*28.80*/(""""/></td>
            """)))}/*29.15*/else/*29.20*/{_display_(Seq[Any](format.raw/*29.21*/("""
                """),format.raw/*30.17*/("""<td><img src="/assets/images/employeeImages/noImage.jpg"/></td>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""<td class="numeric">"""),_display_(/*32.34*/p/*32.35*/.getId),format.raw/*32.41*/("""</td>
            <td class="numeric">"""),_display_(/*33.34*/p/*33.35*/.getSalary),format.raw/*33.45*/("""</td>
            <td class="numeric">"""),_display_(/*34.34*/p/*34.35*/.getAddress),format.raw/*34.46*/("""</td>
            <td class="numeric">"""),_display_(/*35.34*/p/*35.35*/.getStartdate),format.raw/*35.48*/("""</td>
            <td class="numeric">"""),_display_(/*36.34*/p/*36.35*/.getDep),format.raw/*36.42*/("""</td>
            <td>
              <a href=""""),_display_(/*38.25*/routes/*38.31*/.HomeController.updateEmployee(p.getId)),format.raw/*38.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>
            <td>
              <a href=""""),_display_(/*43.25*/routes/*43.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*43.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
            
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(p:models.Employee,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((models.Employee,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 01:27:23 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/versiunea3/SDEV4-CA1/app/views/employeeDetails.scala.html
                  HASH: f9949a5b769cfb108a3fb38dc2c393cfb18c230b
                  MATRIX: 1006->1|1171->71|1199->74|1231->98|1270->100|1300->104|1425->204|1465->236|1504->238|1539->247|1610->292|1623->297|1658->312|1694->321|1738->335|1772->342|2088->631|2175->709|2215->711|2260->728|2332->773|2371->791|2412->814|2425->819|2464->820|2509->837|2617->914|2658->927|2706->948|2716->949|2743->955|2809->994|2819->995|2850->1005|2916->1044|2926->1045|2958->1056|3024->1095|3034->1096|3068->1109|3134->1148|3144->1149|3172->1156|3246->1203|3261->1209|3321->1248|3523->1423|3538->1429|3598->1468|3882->1722
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|70->38|70->38|70->38|75->43|75->43|75->43|89->57
                  -- GENERATED --
              */
          