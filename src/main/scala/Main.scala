import chapter3.solutions.FixedStack

object Main extends App {
  val stacks = new FixedStack[Int](3)
  stacks.push(1, 0)
  stacks.push(2, 0)
  stacks.push(3, 0)

  stacks.push(4, 1)
  stacks.push(5, 1)
  stacks.push(6, 1)

  stacks.push(7, 2)
  stacks.push(8, 2)
  stacks.push(9, 2)

  val a1 = stacks.pop(0)
  val a2 = stacks.pop(0)
  val t1 = stacks.peek(0)
  val t2 = stacks.peek(0)
  val t3 = stacks.peek(0)

}