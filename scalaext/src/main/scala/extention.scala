
@main def extention () = {
  println("hello")
  val us = Country("us",100)
  extension (c: Country)
    def topCity(city: String): String = c.name + city
  println(us.topCity("NY"))

  println(us)
  println(us.topCity)
}

case class Country(name: String, positiveCases: Int)