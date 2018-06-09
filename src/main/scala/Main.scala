import chapter4.book.MyStack

object Main extends App {
  val s = new MyStack[Int]
  s.push(1)
  s.push(2)
  s.push(3)
  // Stack contains the contents
  // [ 3 ]
  // [ 2 ]
  // [ 1 ]
  println(s.toString)
}