
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""



        """),_display_(/*15.10*/inputText(employeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.86*/("""
        """),_display_(/*16.10*/for((value, name)<- Project.options) yield /*16.46*/{_display_(Seq[Any](format.raw/*16.47*/("""
            """),format.raw/*17.13*/("""<input type = "checkbox" name ="catSelect[]" value =""""),_display_(/*17.67*/value),format.raw/*17.72*/(""""
            />"""),_display_(/*18.16*/name),format.raw/*18.20*/("""<br>
        """)))}),format.raw/*19.10*/("""
        """),_display_(/*20.10*/inputText(employeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*20.92*/("""
        """),_display_(/*21.10*/inputText(employeeForm("startdate"), '_label -> "StartDate", 'class -> "form-control")),format.raw/*21.96*/("""
        """),_display_(/*22.10*/inputText(employeeForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*22.90*/("""

        """),_display_(/*24.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.75*/("""
        
        """),format.raw/*26.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.HomeController.index(0)),format.raw/*31.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*35.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 22:24:25 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/SDEV4Lab2Play-modif pornit/app/views/addEmployee.scala.html
                  HASH: 76dcb67f6509c527cbf3fd004af0883ec67f5fde
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1254->108|1293->110|1324->115|1393->159|1550->308|1589->310|1626->347|1663->357|1676->361|1707->371|1747->384|1844->460|1881->470|1933->506|1972->507|2013->520|2094->574|2120->579|2164->596|2189->600|2234->614|2271->624|2374->706|2411->716|2518->802|2555->812|2656->892|2694->903|2780->968|2825->986|3097->1231|3112->1237|3157->1261|3305->1379
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|51->19|52->20|52->20|53->21|53->21|54->22|54->22|56->24|56->24|58->26|63->31|63->31|63->31|67->35
                  -- GENERATED --
              */
          