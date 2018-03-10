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
    * Input:  N = 10000000000, M = 10101, i = 2, j = 6
    * Output: N = 10001010100
    *
    */
  def validate(n: Int, m: Int, i: Int, j: Int) = {

    // n      = 10000000000
    // m      = 00000010101

    val ones = ~0
    // x      = 11111111111

    val left = ones << (j + 1)   // x1 = 11100000000

    val right = (1 << i) - 1   // right = 00000000011

    val mask = left | right
    // other  = 11100000011

    val n_mask = n & mask  // clear bits between n
    // n_mask  = 10000000000

    val m_shift = m << i
    // m_shift = 00001010100

    m_shift | n_mask

  }

  val x = math.pow(2,10).toInt
  val y = (math.pow(2,0) + math.pow(2,2) + math.pow(2,4)).toInt

  val expected = math.pow(2,2) + math.pow(2,4) + math.pow(2,6)

  // BitMap(10001010100) == 1108
  assert(1108 == validate(x, y, 2, 6))

}
