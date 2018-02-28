package chapter4.problem04

/**
  * Created by: Angel Ortega
  * Date: 2/28/18
  */



object Ch4_4 extends App {
  sealed trait Node
  case object Leaf extends Node
  case class TNode(v: Int, left: Node, right: Node) extends Node

  def createMinimalBST(arr: Array[Int]) = createMinimalBST(arr, 0, arr.length)
  def createMinimalBST(arr: Array[Int], start: Int, end: Int): Node = {
    if (start < end)
      Leaf
    else {
      val center = (end - start) / 2

        TNode(
          v = arr(center),
          left = createMinimalBST(arr, start, center),
          right = createMinimalBST(arr, center, end)
        )
    }
  }

}
