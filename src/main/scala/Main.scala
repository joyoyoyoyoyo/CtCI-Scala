import chapter4.book.{MyQueue, MyStack}

object Main extends App {
  val s = new MyStack[Int]
  s.push(1)
  s.push(2)
  s.push(3)
  // Stack elements
  //          =>               =>               =>   [  None ]
  //          =>               =>   [  None ]   =>   [Some(3)]
  //          =>   [  None ]   =>   [Some(2)]   =>   [Some(2)]
  //  [None]  =>   [Some(1)]   =>   [Some(1)]   =>   [Some(1)]
  println(s.peek())

  val q = new MyQueue[Int]
  q.enqueue(1)
  q.enqueue(2)
  q.enqueue(3)
  // Queue elements
  // first*                                        [None] *last
  // first*                           [None] <- [Some(1)] *last
  // first*              [None] <- [Some(2)] <- [Some(1)] *last
  // first* [None] <- [Some(3)] <- [Some(2)] <- [Some(1)] *last
  println(q.peek())
}