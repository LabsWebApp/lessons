var lightOn: Boolean = true //свет горит

val turnOnTheLight = "Turn on the light"
val takeFeed = "Take feed"
val feelTrough = "Feel trough"

if (lightOn == true) {
  println(takeFeed)
  println(feelTrough)
}

if (lightOn) println(s"$takeFeed, $feelTrough")


val ifInstruction: Unit = if (lightOn) {
  println(takeFeed)
  println(feelTrough)
}

if (lightOn) s"$takeFeed, $feelTrough" else s"$turnOnTheLight, $takeFeed, $feelTrough"

lightOn match {
  case true => s"$takeFeed, $feelTrough"
  case false => s"$turnOnTheLight, $takeFeed, $feelTrough"
}

val lightOnString: Any = "lightOn"

lightOnString match {
  case x: Int => println("This is Int " + x)
  case x: String => println("This is String " + x)
  case x => x
  case "lightOn" => s"$takeFeed, $feelTrough"
  case "lightOff" => s"$turnOnTheLight, $takeFeed, $feelTrough"
//  case _ => s"We don't know what to do"
}