package chapter4

import scala.collection.immutable.ListSet

case class Vertex[+T](index: Int, value: T)
object Vertex {
  def apply(index: Int) = {
    new Vertex[Int](index, index)
  }
}

/**
  * Initialize an empty graph with {{{ V }}} vertices and 0 edges.
  *
  * @param V: number of vertices
  * @throws IllegalArgumentException if a negative number is inserted {{{ V < 0 }}}
  */
case class Graph(V: Int) {
  require(V > -1, "The number of vertices in a graph must always have 0 or more vertices.")

  /**
    * Adjaceny-list representation of a graph.
    */
  private val adj: Array[ListSet[Vertex[_]]] = Array.fill(V)(ListSet.empty[Vertex[_]])
  var E = 0

  /**
    * Vertex id {{{ v.id }}} must is indexable
    *
    * @param v the vertex {{{ v }}}
    * @throws IllegalArgumentException only if {{{ v < 0 || v >= V }}}
    */
  private def validateVertex[T](v: Vertex[T]) =
    require(v.index > -1 && v.index < V ,
      s"The vertex $v must be between 0 and ${V - 1}.")

  /**
    * Add an undirected edge v1-v2 to this graph.
    *
    * @param v1 the vertex {{{ v1 }}} connected to {{{ v2 }}}
    * @param v2 the vertex {{{ v2 }}} connected to {{{ v1 }}}
    * @throws IllegalArgumentException only if {{{ v < 0 || v >= V }}}
    */
  def addEdge[T](v1: Vertex[T], v2: Vertex[T]): Unit = {
    validateVertex(v1)
    validateVertex(v2)
    adj(v1.index) = adj(v1.index) + v2
    adj(v2.index) = adj(v2.index) + v1
    E += 1
  }

  /**
    * Lookup adjacent vertices
    * @param v Vertex
    * @return an iterable instance of all adjacent nodes to vertex {{{v }}}
    */
  def adjacent[T](v: Vertex[T]): Iterable[Vertex[_]] = {
    validateVertex(v)
    adj(v.index)
  }
}

/**
  * Created by: Angel Ortega
  * Date: 2/2/2018
  */

