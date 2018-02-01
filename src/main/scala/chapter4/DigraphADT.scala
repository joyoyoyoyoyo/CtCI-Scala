package chapter4

import scala.collection.immutable.ListSet

/**
  * Adjaceny-list representation of a directed-graph
  * @param V: number of vertices to insert
  */
class DigraphADT(val V: Int) {

  val vertices = Array.fill(V + 1)(ListSet.empty[Int])
  var E = 0

  def addEdge(e1: Int, e2: Int): Unit = {
    vertices(e1) = vertices(e1) + e2
    E = E + 1
  }

  def adj(vertex: Int): Iterable[Int] = vertices(vertex)
}
