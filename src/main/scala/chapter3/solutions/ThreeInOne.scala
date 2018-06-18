package chapter3.solutions

class FixedStack[Option[T]](val stackCapacity: Int) {

  val arr: Array[Option[T]] = Array.fill(stackCapacity * 3)(None)
  val sz: Array[Int] = Array.fill(3)(0)

  def push(item: T, stackID: Int): Unit = {
    require(stackID > = 0 && stackID < stackCapacity)

    if (sz(stackID) == stackCapacity)
      throw new StackOverflowException()

    arr(stackID * 3 + sz(stackID)) = Some(item)
    sz(stackID) += 1
  }

  def pop(stackID: Int): T = {
    require(stackID > = 0 && stackID < stackCapacity)
    if (sz(stackID) == 0)
      throw new NoSuchElementException()

    val item = arr(stackID * 3 + sz(stackID))
    arr(stackID * 3 + sz(stackID)) = None
    sz(stackID) -= 1
    item.get
  }

  def peek(stackID: Int): T = {
    if (isEmpty(stackID))
      throw new NoSuchElementException("Stack is empty")
    arr(3 * stackID + sz(stackID)).get
  }

  def isEmpty(stackID: Int): Boolean = sz(stackID) == 0



}
