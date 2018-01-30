package chapter4

class Node(val v: Int, val left: BinaryNode, val right: BinaryNode)
  extends BinaryNode
  with Ordered[Node] {
  override def compare(that: Node): Int = this.v - that.v
}

trait BinaryNode  {
}

class Leaf(val v: Int) extends BinaryNode with Ordered[Leaf]{
  val left = EmptyTree
  val right = EmptyTree
  override def compare(that: Leaf): Int = this.v - that.v
}

case object EmptyTree extends BinaryNode




class TreeADT {
  var root: BinaryNode = EmptyTree

  def insert(v: Int): Unit = {
    root match {
      case EmptyTree => root = new Node(v, EmptyTree, EmptyTree)
      case node: Node if v > node.v  => insert(v, root)
      case node: Node if v < node.v => insert(v, root)
    }
  }

  def insert(v: Int, node: BinaryNode): BinaryNode = ???

}

