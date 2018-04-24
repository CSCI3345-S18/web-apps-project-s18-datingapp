// @GENERATOR:play-routes-compiler
// @SOURCE:/users/akim/Local/HTML-Documents/ScalaPlay/conf/routes
// @DATE:Thu Apr 12 11:55:26 CDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_6: controllers.Assets,
  // @LINE:26
  TempController_4: controllers.TempController,
  // @LINE:39
  TaskController_7: controllers.TaskController,
  // @LINE:54
  WSChatController_5: controllers.WSChatController,
  // @LINE:58
  DrawController_3: controllers.DrawController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_6: controllers.Assets,
    // @LINE:26
    TempController_4: controllers.TempController,
    // @LINE:39
    TaskController_7: controllers.TaskController,
    // @LINE:54
    WSChatController_5: controllers.WSChatController,
    // @LINE:58
    DrawController_3: controllers.DrawController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_6, TempController_4, TaskController_7, WSChatController_5, DrawController_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_6, TempController_4, TaskController_7, WSChatController_5, DrawController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """plot""", """controllers.HomeController.plot"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """phone/""" + "$" + """phone<\d{3}-\d{3}-\d{4}>""", """controllers.HomeController.phone(phone:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.HomeController.todo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp""", """controllers.TempController.welcome"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp""", """controllers.TempController.tempTable"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot""", """controllers.TempController.tempPlotPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot/temps""", """controllers.TempController.tempPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot/precip""", """controllers.TempController.precipPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginpage""", """controllers.TaskController.welcome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create-user""", """controllers.TaskController.createUserPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginpage""", """controllers.TaskController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskpage""", """controllers.TaskController.createTaskPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """taskpage""", """controllers.TaskController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtask""", """controllers.TaskController.createTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetask""", """controllers.TaskController.deleteTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.TaskController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wschat""", """controllers.WSChatController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socket""", """controllers.WSChatController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """groupdraw""", """controllers.DrawController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socketdraw""", """controllers.DrawController.socket"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_plot4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plot")))
  )
  private[this] lazy val controllers_HomeController_plot4_invoker = createInvoker(
    HomeController_1.plot,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "plot",
      Nil,
      "GET",
      this.prefix + """plot""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_phone5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("phone/"), DynamicPart("phone", """\d{3}-\d{3}-\d{4}""",false)))
  )
  private[this] lazy val controllers_HomeController_phone5_invoker = createInvoker(
    HomeController_1.phone(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "phone",
      Seq(classOf[String]),
      "GET",
      this.prefix + """phone/""" + "$" + """phone<\d{3}-\d{3}-\d{4}>""",
      """ Demonstrate a regular expression for a route""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_todo6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_HomeController_todo6_invoker = createInvoker(
    HomeController_1.todo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "todo",
      Nil,
      "GET",
      this.prefix + """todo""",
      """ Demonstrate TODO for a route""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_TempController_welcome7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp")))
  )
  private[this] lazy val controllers_TempController_welcome7_invoker = createInvoker(
    TempController_4.welcome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "welcome",
      Nil,
      "GET",
      this.prefix + """temp""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TempController_tempTable8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp")))
  )
  private[this] lazy val controllers_TempController_tempTable8_invoker = createInvoker(
    TempController_4.tempTable,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempTable",
      Nil,
      "POST",
      this.prefix + """temp""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TempController_tempPlotPage9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot")))
  )
  private[this] lazy val controllers_TempController_tempPlotPage9_invoker = createInvoker(
    TempController_4.tempPlotPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempPlotPage",
      Nil,
      "POST",
      this.prefix + """tempplot""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TempController_tempPlot10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot/temps")))
  )
  private[this] lazy val controllers_TempController_tempPlot10_invoker = createInvoker(
    TempController_4.tempPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempPlot",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """tempplot/temps""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TempController_precipPlot11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot/precip")))
  )
  private[this] lazy val controllers_TempController_precipPlot11_invoker = createInvoker(
    TempController_4.precipPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "precipPlot",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """tempplot/precip""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_TaskController_welcome12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginpage")))
  )
  private[this] lazy val controllers_TaskController_welcome12_invoker = createInvoker(
    TaskController_7.welcome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "welcome",
      Nil,
      "GET",
      this.prefix + """loginpage""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_TaskController_createUserPage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create-user")))
  )
  private[this] lazy val controllers_TaskController_createUserPage13_invoker = createInvoker(
    TaskController_7.createUserPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "createUserPage",
      Nil,
      "GET",
      this.prefix + """create-user""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_TaskController_createUser14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginpage")))
  )
  private[this] lazy val controllers_TaskController_createUser14_invoker = createInvoker(
    TaskController_7.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """loginpage""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_TaskController_createTaskPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskpage")))
  )
  private[this] lazy val controllers_TaskController_createTaskPage15_invoker = createInvoker(
    TaskController_7.createTaskPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "createTaskPage",
      Nil,
      "GET",
      this.prefix + """taskpage""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_TaskController_login16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("taskpage")))
  )
  private[this] lazy val controllers_TaskController_login16_invoker = createInvoker(
    TaskController_7.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "login",
      Nil,
      "POST",
      this.prefix + """taskpage""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_TaskController_createTask17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtask")))
  )
  private[this] lazy val controllers_TaskController_createTask17_invoker = createInvoker(
    TaskController_7.createTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "createTask",
      Nil,
      "POST",
      this.prefix + """addtask""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_TaskController_deleteTask18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetask")))
  )
  private[this] lazy val controllers_TaskController_deleteTask18_invoker = createInvoker(
    TaskController_7.deleteTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "deleteTask",
      Nil,
      "POST",
      this.prefix + """deletetask""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TaskController_logout19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_TaskController_logout19_invoker = createInvoker(
    TaskController_7.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_WSChatController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wschat")))
  )
  private[this] lazy val controllers_WSChatController_index20_invoker = createInvoker(
    WSChatController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WSChatController",
      "index",
      Nil,
      "GET",
      this.prefix + """wschat""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_WSChatController_socket21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socket")))
  )
  private[this] lazy val controllers_WSChatController_socket21_invoker = createInvoker(
    WSChatController_5.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WSChatController",
      "socket",
      Nil,
      "GET",
      this.prefix + """socket""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_DrawController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("groupdraw")))
  )
  private[this] lazy val controllers_DrawController_index22_invoker = createInvoker(
    DrawController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DrawController",
      "index",
      Nil,
      "GET",
      this.prefix + """groupdraw""",
      """######## Routes for the WebSocket drawing code ###########""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_DrawController_socket23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socketdraw")))
  )
  private[this] lazy val controllers_DrawController_socket23_invoker = createInvoker(
    DrawController_3.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DrawController",
      "socket",
      Nil,
      "GET",
      this.prefix + """socketdraw""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HomeController_plot4_route(params@_) =>
      call { 
        controllers_HomeController_plot4_invoker.call(HomeController_1.plot)
      }
  
    // @LINE:19
    case controllers_HomeController_phone5_route(params@_) =>
      call(params.fromPath[String]("phone", None)) { (phone) =>
        controllers_HomeController_phone5_invoker.call(HomeController_1.phone(phone))
      }
  
    // @LINE:22
    case controllers_HomeController_todo6_route(params@_) =>
      call { 
        controllers_HomeController_todo6_invoker.call(HomeController_1.todo)
      }
  
    // @LINE:26
    case controllers_TempController_welcome7_route(params@_) =>
      call { 
        controllers_TempController_welcome7_invoker.call(TempController_4.welcome)
      }
  
    // @LINE:28
    case controllers_TempController_tempTable8_route(params@_) =>
      call { 
        controllers_TempController_tempTable8_invoker.call(TempController_4.tempTable)
      }
  
    // @LINE:30
    case controllers_TempController_tempPlotPage9_route(params@_) =>
      call { 
        controllers_TempController_tempPlotPage9_invoker.call(TempController_4.tempPlotPage)
      }
  
    // @LINE:32
    case controllers_TempController_tempPlot10_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_tempPlot10_invoker.call(TempController_4.tempPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:34
    case controllers_TempController_precipPlot11_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_precipPlot11_invoker.call(TempController_4.precipPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:39
    case controllers_TaskController_welcome12_route(params@_) =>
      call { 
        controllers_TaskController_welcome12_invoker.call(TaskController_7.welcome)
      }
  
    // @LINE:40
    case controllers_TaskController_createUserPage13_route(params@_) =>
      call { 
        controllers_TaskController_createUserPage13_invoker.call(TaskController_7.createUserPage)
      }
  
    // @LINE:41
    case controllers_TaskController_createUser14_route(params@_) =>
      call { 
        controllers_TaskController_createUser14_invoker.call(TaskController_7.createUser)
      }
  
    // @LINE:43
    case controllers_TaskController_createTaskPage15_route(params@_) =>
      call { 
        controllers_TaskController_createTaskPage15_invoker.call(TaskController_7.createTaskPage)
      }
  
    // @LINE:44
    case controllers_TaskController_login16_route(params@_) =>
      call { 
        controllers_TaskController_login16_invoker.call(TaskController_7.login)
      }
  
    // @LINE:46
    case controllers_TaskController_createTask17_route(params@_) =>
      call { 
        controllers_TaskController_createTask17_invoker.call(TaskController_7.createTask)
      }
  
    // @LINE:47
    case controllers_TaskController_deleteTask18_route(params@_) =>
      call { 
        controllers_TaskController_deleteTask18_invoker.call(TaskController_7.deleteTask)
      }
  
    // @LINE:49
    case controllers_TaskController_logout19_route(params@_) =>
      call { 
        controllers_TaskController_logout19_invoker.call(TaskController_7.logout)
      }
  
    // @LINE:54
    case controllers_WSChatController_index20_route(params@_) =>
      call { 
        controllers_WSChatController_index20_invoker.call(WSChatController_5.index)
      }
  
    // @LINE:55
    case controllers_WSChatController_socket21_route(params@_) =>
      call { 
        controllers_WSChatController_socket21_invoker.call(WSChatController_5.socket)
      }
  
    // @LINE:58
    case controllers_DrawController_index22_route(params@_) =>
      call { 
        controllers_DrawController_index22_invoker.call(DrawController_3.index)
      }
  
    // @LINE:59
    case controllers_DrawController_socket23_route(params@_) =>
      call { 
        controllers_DrawController_socket23_invoker.call(DrawController_3.socket)
      }
  }
}
