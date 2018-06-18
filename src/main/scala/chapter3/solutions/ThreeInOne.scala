package chapter3.solutions

class FixedStack[T](val stackCapacity: Int) {

  val arr: Array[Option[T]] = Array.fill(stackCapacity * 3)(None)
  val sz: Array[Int] = Array.fill(3)(0)

  def push(item: T, stackID: Int): Unit = {
    require(stackID >= 0 && stackID < stackCapacity, s"StackID must be in bounds of [0 - ${stackCapacity - 1}], inclusive")

    if (sz(stackID) == stackCapacity)
      throw new StackOverflowError()

    arr(stackID * 3 + sz(stackID)) = Some(item)
    sz(stackID) += 1
  }

  def pop(stackID: Int): T = {
    require(stackID >= 0 && stackID < stackCapacity)
    if (sz(stackID) == 0)
      throw new NoSuchElementException("Stack is empty")

    sz(stackID) -= 1
    val item = arr(stackID * 3 + sz(stackID))
    arr(stackID * 3 + sz(stackID)) = None
    item.get
  }

  def peek(stackID: Int): T = {
    if (isEmpty(stackID))
      throw new NoSuchElementException("Stack is empty")
    arr(3 * stackID + sz(stackID) - 1).get
  }

  def isEmpty(stackID: Int): Boolean = sz(stackID) == 0

}
