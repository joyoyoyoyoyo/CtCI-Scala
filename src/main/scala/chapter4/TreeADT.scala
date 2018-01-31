package chapter4

class Node(var v: Int, var left: BinaryNode, var right: BinaryNode)
  extends BinaryNode
  with Ordered[Node] {
  override def compare(that: Node): Int = this.v - that.v

  override def toString: String = s"( v=$v, left=${left.toString}, right=${right.toString} )"
}

trait BinaryNode  {
}

class Leaf(var v: Int) extends BinaryNode with Ordered[Leaf]{
  var left: BinaryNode = EmptyTree
  var right: BinaryNode = EmptyTree
  override def compare(that: Leaf): Int = this.v - that.v
}

case object EmptyTree extends BinaryNode




class TreeADT {
  var root: BinaryNode = EmptyTree

  def insert(v: Int): Unit = {
    root match {
      case EmptyTree => root = new Node(v, EmptyTree, EmptyTree)
      case node: Node if v < node.v => { node.left = insert(v, node.left)}
      case node: Node if v > node.v  => { node.right = insert(v, node.right) }
      case node: Node if v == node.v => ()
    }
  }

  /**
    * Although, insert is a recursive algorithm. insert has an amortized O(logN) tree traversal for insertions.
    * So having a non-tail-recursive insertion works because of the BST traits
    * @param v
    * @param node
    * @return
    */
  private def insert(v: Int, node: BinaryNode): BinaryNode = {
    node match {
      case EmptyTree => new Node(v, EmptyTree, EmptyTree);
      case node: Node if v < node.v => { node.left = insert(v, node.left); node }
      case node: Node if v > node.v => { node.right = insert(v, node.right); node }
      case node: Node if v == node.v => node
    }
  }

  override def toString(): String = root.toString

}

