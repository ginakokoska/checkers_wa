// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Yannick/IdeaProjects/Checkers_WA/conf/routes
// @DATE:Sat Dec 03 03:36:19 CET 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def processRequest(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "command")
    }
  
    // @LINE:9
    def new10Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new10Grid")
    }
  
    // @LINE:10
    def instructions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instructions")
    }
  
    // @LINE:12
    def move(start:String, dest:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "move/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("start", start)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dest", dest)))
    }
  
    // @LINE:14
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "websocket")
    }
  
    // @LINE:11
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:13
    def current(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "current")
    }
  
    // @LINE:7
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def new8Grid(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "new8Grid")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
