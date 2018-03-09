
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

object addDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentForm: Form[models.Department],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Department",user)/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new department</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addDepartmentSubmit(), 'class-> "form-horizontal", 'role -> "form")/*6.107*/ {_display_(Seq[Any](format.raw/*6.109*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(departmentForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*9.88*/("""
        """),_display_(/*10.10*/inputText(departmentForm("code"), '_label -> "Code", 'class -> "form_control")),format.raw/*10.88*/("""

        """),_display_(/*12.10*/inputText(departmentForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*12.77*/("""

        """),format.raw/*14.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Department" class="btn btn-primary">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.department),format.raw/*16.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*20.10*/("""
""")))}))
      }
    }
  }

  def render(departmentForm:Form[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departmentForm,user)

  def f:((Form[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departmentForm,user) => apply(departmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 22:24:25 GMT 2018
                  SOURCE: C:/Users/culi/Desktop/de lucru CA/SDEV4Lab2Play-modif pornit/app/views/addDepartment.scala.html
                  HASH: 68de37fbaa3cc932d0b322734342a9fcc429f84c
                  MATRIX: 991->1|1129->68|1174->66|1201->84|1228->86|1263->113|1302->115|1333->120|1404->166|1514->267|1554->269|1590->279|1602->283|1632->293|1669->304|1767->382|1804->392|1903->470|1941->481|2029->548|2066->558|2225->690|2240->696|2287->722|2440->844
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|42->10|44->12|44->12|46->14|48->16|48->16|48->16|52->20
                  -- GENERATED --
              */
          