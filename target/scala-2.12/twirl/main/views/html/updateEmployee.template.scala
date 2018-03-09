
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*3.2*/main("Update employee", user)/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Employee</p>

    """),_display_(/*6.6*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal",
        'role -> "form",'enctype -> "multipart/form-data")/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
        """),format.raw/*8.37*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""
        """),_display_(/*10.10*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.92*/("""
        """),_display_(/*11.10*/inputText(updateEmployeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*11.98*/("""
        """),_display_(/*12.10*/for((value,name)<- Project.options) yield /*12.45*/{_display_(Seq[Any](format.raw/*12.46*/("""
            """),format.raw/*13.13*/("""<input type ="checkbox" name ="catSelect[]"value =""""),_display_(/*13.65*/value),format.raw/*13.70*/(""""
            """),_display_(/*14.14*/if(Project.inProject(value.toLong,id))/*14.52*/{_display_(Seq[Any](format.raw/*14.53*/("""
                """),format.raw/*15.17*/("""checked
            """)))}),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""/>"""),_display_(/*17.16*/name),format.raw/*17.20*/("""<br>
        """)))}),format.raw/*18.10*/("""

        """),_display_(/*20.10*/inputText(updateEmployeeForm("startdate"), '_label -> "StartDate", 'class -> "form-control")),format.raw/*20.102*/("""
    """),_display_(/*21.6*/inputText(updateEmployeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*21.92*/("""
    
    """),format.raw/*23.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.index(0)),format.raw/*29.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*33.3*/("""
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 22:24:26 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/SDEV4Lab2Play-modif pornit/app/views/updateEmployee.scala.html
                  HASH: 0a05120ce740e6c2de311342b303fda98191f608
                  MATRIX: 995->1|1146->81|1191->79|1218->98|1255->127|1293->128|1320->129|1388->172|1543->319|1582->321|1618->358|1654->368|1666->372|1696->382|1733->392|1836->474|1873->484|1982->572|2019->582|2070->617|2109->618|2150->631|2229->683|2255->688|2297->703|2344->741|2383->742|2428->759|2480->780|2521->793|2551->796|2576->800|2621->814|2659->825|2773->917|2805->923|2912->1009|2949->1019|3201->1244|3216->1250|3261->1274|3394->1377|3426->1379
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|48->16|49->17|49->17|49->17|50->18|52->20|52->20|53->21|53->21|55->23|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          