import ImplicitEx.Color

import Console._

object Context {
  given Color = Color.Red
}
import Context.{given Color}

object ImplicitEx {
  def main(args: Array[String]): Unit = {
    println("hello")
  }

//  def (s: String) (
//  given c: Color
//  ):
//  String = {
//    s"${c.ansi}$s$RESET"
//  }
//
enum Color(val ansi: String) {
  case Red extends Color(RED)
  case Blue extends Color(BLUE)
  case Green extends Color(GREEN)
}
}
