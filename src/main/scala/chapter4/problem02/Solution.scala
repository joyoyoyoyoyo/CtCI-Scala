package chapter4.problem02

import chapter4.{Graph, Vertex}

/**
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
object Solution {

  object State extends Enumeration {
    val Visited, Visiting, Unvisited = Value
  }

  object Paths {

    @scala.annotation.tailrec
    def searchWhile(cond: => Boolean)(g: Graph[Vertex[Int]], u: Vertex[Int], end: Vertex[Int], q: List[Vertex[Int]]): Boolean = {
      if (u == end)
        true
      else if (cond)
        false
      else {
        val traversing = g.adjacent(u).foldLeft(q) {
          (acc, node) => {
            g.vertices(u.index).state = State.Visiting
            if (node.state == State.Unvisited)
              node :: acc
            else
              acc
          }
        }
        searchWhile(traversing.isEmpty)(g, traversing.head, end, traversing.tail)
      }
    }

    def isPath(g: Graph[Vertex[Int]], start: Vertex[Int], end: Vertex[Int]): Boolean = {
      g.vertices.foreach(_.state = State.Unvisited)
      val q = List(start)
      searchWhile(q.nonEmpty)(g, q.head, end , q.tail)
    }

  }


}
