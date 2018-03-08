package chapter5

/**
  * Created by: Angel Ortega
  * Date: 3/8/18
  */
object Insertion extends App {
  /**
    * You are given two 32-bit numbers, N and M, and two bit positions, i and j.
    * Write a method to set all bits between i and j in N equal to M (e.g., M becomes
    * a substring of N located at i and starting at j).
    * EXAMPLE:
    * Input: N = 10000000000, M = 10101, i = 2, j = 6
    * Output: N = 10001010100
    *
    */
  def validate(N: Int, M: Int, i: Int, j: Int) = {

    // n      = 10000000000
    // m      = 00000010101
    // output = 10001010100

    // m_mask = 1111mmmmm11
    // n_mask = 10001111100

    // m_mask & n_mask
    (M << i) | N
  }

  val x = 2^10
  val y = 2^0 + 2^2 + 2^4

  val expected = 2^2 + 2^4 + 2^6

  println(validate(x, y, 2, 6))

}
