// @GENERATOR:play-routes-compiler
// @SOURCE:/users/akim/Local/HTML-Documents/ScalaPlay/conf/routes
// @DATE:Thu Apr 12 11:55:26 CDT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseDrawController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DrawController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socketdraw"})
        }
      """
    )
  
    // @LINE:58
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DrawController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "groupdraw"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseWSChatController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSChatController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socket"})
        }
      """
    )
  
    // @LINE:54
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSChatController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wschat"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseTempController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def tempPlotPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempPlotPage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot"})
        }
      """
    )
  
    // @LINE:28
    def tempTable: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempTable",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "temp"})
        }
      """
    )
  
    // @LINE:32
    def tempPlot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempPlot",
      """
        function(startMonth0,startYear1,endMonth2,endYear3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot/temps" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startMonth", startMonth0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startYear", startYear1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endMonth", endMonth2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endYear", endYear3)])})
        }
      """
    )
  
    // @LINE:26
    def welcome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.welcome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temp"})
        }
      """
    )
  
    // @LINE:34
    def precipPlot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.precipPlot",
      """
        function(startMonth0,startYear1,endMonth2,endYear3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot/precip" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startMonth", startMonth0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startYear", startYear1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endMonth", endMonth2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endYear", endYear3)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def plot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.plot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plot"})
        }
      """
    )
  
    // @LINE:22
    def todo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.todo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:19
    def phone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.phone",
      """
        function(phone0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "phone/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("phone", phone0)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginpage"})
        }
      """
    )
  
    // @LINE:46
    def createTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.createTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtask"})
        }
      """
    )
  
    // @LINE:40
    def createUserPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.createUserPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create-user"})
        }
      """
    )
  
    // @LINE:47
    def deleteTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.deleteTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetask"})
        }
      """
    )
  
    // @LINE:49
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:39
    def welcome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.welcome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginpage"})
        }
      """
    )
  
    // @LINE:43
    def createTaskPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.createTaskPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskpage"})
        }
      """
    )
  
    // @LINE:44
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "taskpage"})
        }
      """
    )
  
  }


}
