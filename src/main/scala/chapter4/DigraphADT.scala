package chapter4

import scala.collection.immutable.ListSet

/**
  * Adjaceny-list representation of a directed-graph
  * @param numVertices
  */
class DigraphADT(numVertices: Int) {

  val vertices = Array.fill(numVertices + 1)(ListSet.empty[Int])

  def insert(e1: Int, e2: Int): Unit =
    vertices(e1) = vertices(e1) + e2

  def adj(vertex: Int): ListSet[Int] = vertices(vertex)
}
