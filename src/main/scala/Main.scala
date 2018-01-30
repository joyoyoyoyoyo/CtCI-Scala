package chapter4

object Main extends App {
  val x = new TreeADT
  x.insert(-10)
  println(x)
  println(x.isBalanced())

  x.insert(2)
  println(x)
  println(x.isBalanced())
  x.insert(100)
  println(x)
  println(x.isBalanced())


  x.insert(-200)
  println(x)
  println(x.isBalanced())

  x.insert(-7)
  println(x)
  println(x.isBalanced())

  x.insert(-9)
  println(x)
  println(x.isBalanced())


  //  x.insert(-1000)
//  x.insert(-1110)
//  x.insert(-1)
//  println(x)
//  x.insert(1)
//  println(x)

}
