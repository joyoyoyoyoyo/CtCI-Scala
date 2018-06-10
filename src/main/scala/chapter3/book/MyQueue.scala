package chapter3.book

import chapter3.book.MyQueue.QueueNode

object MyQueue {

  class QueueNode[T](var data: T) {
    private[MyQueue] var next: Option[QueueNode[T]] = None
  }

}

class MyQueue[T] {

  private var first: Option[QueueNode[T]] = None
  private var last: Option[QueueNode[T]] = None

  def enqueue(item: T): Unit = {
    last match {
      case Some(frame) =>
        val t = Some(new QueueNode(item))
        frame.next = t
        last = t
      case None => last = Some(new QueueNode(item))
    }

    if (first.isEmpty)
      first = last

  }

  def dequeue(): T = {
    first match {
      case Some(frame) =>
        val t = frame.data
        first = frame.next
        if (first.isEmpty)
          last = first
        t
      case None => throw new NoSuchElementException()
    }

  }

  def peek(): T = {
    first match {
      case Some(frame) => val copy = frame.data; copy
      case None => throw new NoSuchElementException()
    }
  }

  def isEmpty: Boolean = last.isEmpty
}
