
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/culi/Desktop/de lucru CA/versiunea3/SDEV4-CA1/conf/routes
// @DATE:Fri Mar 09 01:27:26 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
