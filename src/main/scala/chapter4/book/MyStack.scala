package chapter4.book

import java.util.EmptyStackException
import chapter4.book.MyStack.StackNode

object MyStack {

  class StackNode[T](var data: T) {
    private[MyStack] var next: Option[StackNode[T]] = None
  }

}

class MyStack[T] {
  private var top: Option[StackNode[T]] = None

  def pop(): T = {
    top match {
      case Some(frame) => {
        val item = frame.data // will need to be a var?
        top = frame.next // is this public or private? can this be referenced?
        item // will this be null or new StackNode(top.data)?
      }
      case None => throw new EmptyStackException()
    }
  }

  def push(item: T): Unit =  {
    val t = new StackNode[T](item)
    t.next = top
    top = Some(t)
  }

  def peek(): T = {
    top match {
      case Some(frame) => frame.data
      case None => throw new EmptyStackException()
    }
  }

  def isEmpty: Boolean = top.isDefined

  override def toString: String = top.mkString(" ")
}
