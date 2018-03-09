
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("Employee",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Projects</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Projects</a>
      """),_display_(/*12.8*/for(c <- projects) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getEmployees.size()),format.raw/*14.53*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Foto</th>
          <th>ID</th>
          <th>Name</th>
          <th>Department</th>





        </tr>
      </thead>

      <tbody>
        """),_display_(/*41.10*/for(p<-employees ) yield /*41.28*/ {_display_(Seq[Any](format.raw/*41.30*/("""
          """),format.raw/*42.11*/("""<tr>
              """),_display_(/*43.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*43.105*/ {_display_(Seq[Any](format.raw/*43.107*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*44.73*/(p.getId + ".jpg")),format.raw/*44.91*/(""""/></td>
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
                """),format.raw/*46.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""<td class="numeric">"""),_display_(/*48.34*/p/*48.35*/.getId),format.raw/*48.41*/("""</td>
            <td><a href=""""),_display_(/*49.27*/routes/*49.33*/.HomeController.employeeDetails(p.getId)),format.raw/*49.73*/("""">
                """),_display_(/*50.18*/p/*50.19*/.getName),format.raw/*50.27*/("""
               """),format.raw/*51.16*/("""</a>
            </td>
          <td><a href=""""),_display_(/*53.25*/routes/*53.31*/.HomeController.employeeDetails(p.getId)),format.raw/*53.71*/("""">
          """),_display_(/*54.12*/p/*54.13*/.getDep),format.raw/*54.20*/("""
          """),format.raw/*55.11*/("""</a>
          </td>




          </tr>
        """)))}),format.raw/*62.10*/("""
      """),format.raw/*63.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*68.17*/routes/*68.23*/.HomeController.addEmployee()),format.raw/*68.52*/("""">
        <button class="btn btn-primary">Add a employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*74.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.Employee],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 01:27:23 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/versiunea3/SDEV4-CA1/app/views/index.scala.html
                  HASH: b6c3f8d8c1995723ef156ad4160ad587094723d7
                  MATRIX: 1023->1|1236->118|1264->121|1293->142|1332->144|1360->146|1541->300|1556->306|1601->330|1677->380|1711->398|1751->400|1787->409|1824->419|1839->425|1890->455|1944->482|1954->483|1983->491|2022->502|2070->523|2080->524|2121->544|2179->572|2211->577|2355->695|2396->727|2436->729|2472->738|2544->783|2558->788|2594->803|2630->812|2674->826|2708->833|2914->1012|2948->1030|2988->1032|3027->1043|3074->1063|3173->1152|3214->1154|3259->1171|3342->1227|3381->1245|3422->1268|3435->1273|3474->1274|3519->1291|3638->1379|3679->1392|3727->1413|3737->1414|3764->1420|3823->1452|3838->1458|3899->1498|3946->1518|3956->1519|3985->1527|4029->1543|4103->1590|4118->1596|4179->1636|4220->1650|4230->1651|4258->1658|4297->1669|4378->1719|4412->1726|4487->1774|4502->1780|4552->1809|4686->1913
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|85->53|85->53|85->53|86->54|86->54|86->54|87->55|94->62|95->63|100->68|100->68|100->68|106->74
                  -- GENERATED --
              */
          