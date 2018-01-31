package chapter4

object Main extends App {
  val x = new TreeADT
  x.insert(1)
  println(x)
  x.insert(2)
  println(x)
  x.insert(-1000)
  x.insert(-1110)
  x.insert(-1)
  println(x)
  x.insert(1)
  println(x)

}
