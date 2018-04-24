// @GENERATOR:play-routes-compiler
// @SOURCE:/users/akim/Local/HTML-Documents/ScalaPlay/conf/routes
// @DATE:Thu Apr 12 11:55:26 CDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:58
  class ReverseDrawController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "socketdraw")
    }
  
    // @LINE:58
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "groupdraw")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:54
  class ReverseWSChatController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "socket")
    }
  
    // @LINE:54
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wschat")
    }
  
  }

  // @LINE:26
  class ReverseTempController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def tempPlotPage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tempplot")
    }
  
    // @LINE:28
    def tempTable(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "temp")
    }
  
    // @LINE:32
    def tempPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tempplot/temps" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startMonth", startMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startYear", startYear)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endMonth", endMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endYear", endYear)))))
    }
  
    // @LINE:26
    def welcome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "temp")
    }
  
    // @LINE:34
    def precipPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tempplot/precip" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startMonth", startMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startYear", startYear)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endMonth", endMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endYear", endYear)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def plot(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plot")
    }
  
    // @LINE:22
    def todo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:19
    def phone(phone:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "phone/" + implicitly[play.api.mvc.PathBindable[String]].unbind("phone", phone))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:39
  class ReverseTaskController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginpage")
    }
  
    // @LINE:46
    def createTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtask")
    }
  
    // @LINE:40
    def createUserPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create-user")
    }
  
    // @LINE:47
    def deleteTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletetask")
    }
  
    // @LINE:49
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:39
    def welcome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginpage")
    }
  
    // @LINE:43
    def createTaskPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "taskpage")
    }
  
    // @LINE:44
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "taskpage")
    }
  
  }


}
