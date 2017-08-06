package controllers

//import play.api._
import play.api.mvc._
//import play.api.libs.oauth._
//import play.api.Play.current
//import scala.concurrent.Future
//import play.api.libs.concurrent.Execution.Implicits._
//import play.api.libs.ws._
//import play.api.libs.iteratee._
//import play.api.Logger

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def tweets = Action {
    Ok
  }  

}

