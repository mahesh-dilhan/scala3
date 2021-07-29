import MathService.*

@main def Kuztomizemap: Unit =
  println("Kuztomize fn ")
  println(msg)
  def double(i : Int) = i * 2
  println(mapown(double, List(1, 2, 3)))

  def strlen(s: String) = s.length
  println(mapown(strlen, List("a", "bb", "ccc")))

  val helloKuztomize = greet("function ")
  //println(helloKuztomize)
  println(helloKuztomize("Kuztomize"))
// use the object

  println(add(1,1))        // 2
  println(multiply(2,2))   // 4

def msg = "Kuztomize Map function "

def mapown[A, B](f: (B) => A, xs: List[B]): List[A] =
  for x <- xs yield f(x)

def greet(theGreeting: String): String => Unit =
  (name: String) => println(s"$theGreeting, $name")


trait AddService:
  def add(a: Int, b: Int) = a + b

trait MultiplyService:
  def multiply(a: Int, b: Int) = a * b

// implement those traits as a concrete object
object MathService extends AddService, MultiplyService

