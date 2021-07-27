@main def Kuztomizemap: Unit =
  println("Kuztomize fn ")
  println(msg)
  def double(i : Int) = i * 2
  println(mapown(double, List(1, 2, 3)))

  def strlen(s: String) = s.length
  println(mapown(strlen, List("a", "bb", "ccc")))

def msg = "Kuztomize Map function "

def mapown[A, B](f: (B) => A, xs: List[B]): List[A] =
  for x <- xs yield f(x)