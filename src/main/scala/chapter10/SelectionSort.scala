//package chapter10
//
//object SelectionSort {
//
//  /** Selection sort operates by finding the minimum or maximum,
//    * and swapping to the front
//    *
//    * Time Complexity: O(n^2)
//    * @param x is an unordered sequence
//    */
//  def sort[A](unordered: Seq[A])(implicit ordered: Ordered[A]): Seq[A] = {
//    unordered match {
//      case Nil => Nil
//      case x :: Nil => x
//      case x :: xs => {
//        val minRight = xs.reduce(_ min _)
//        if (minRight < x)
//          minRight :: SelectionSort.sort(x :: (xs -- minRight))
//        else
//          x :: SelectionSort.sort(minRight :: xs)
//      }
//    }
//  }
//
//
//}
