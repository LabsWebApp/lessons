//цикл с предусловием
var i = 0
val a: Unit = while (i < 3) {
  println(i)
  i += 1
}

//цикл с постусловием
var j = 0
val b = do {
  println(j)
  j += 1
}
while (j < 0)

//цикл со счётчиком
val c: Unit = for (i <- 0 until 3) println(i)

for (i <- "Hello") println(i)

//расширенный цикл for

for (i <- 0 until 3; j <- 0 until 3 if i != j) println(s"i = $i, j = $j")

//for-comprehension
val d: Seq[Int] = for (i <- 1 to 3) yield i*10

//бесконечный цикл
while (true) println(1)