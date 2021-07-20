

@main def etaexpansion() =
  println("Eta expansion")
  println(List(1,2,3).map(timesto10))

  def timesto10(i: Int) :Int = i*10
