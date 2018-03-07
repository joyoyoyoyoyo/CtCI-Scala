package chapter1

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/6/18
  */
class ZeroMatrixTest extends FlatSpec with Matchers {

  "Should not null anything" should "mat" in {
    val mat = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val matExpected = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    assert(ZeroMatrix.nullifyMatrix(mat) sameElements matExpected)
  }

  "Nullify columns and rows" should "make 0" in {
    val mat = Array(Array(0, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val matActual = ZeroMatrix.nullifyMatrix(mat)
    val matExpected = Array(Array(0, 0, 0), Array(0, 5, 6), Array(0, 8, 9))
    assert(matActual.deep ==  matExpected.deep)
  }

  "Center being zero" should "make all center elements zero" in {
    val mat = Array(Array(-10, 5, 3), Array(4, 0, 6), Array(7, 8, 9))
    val matActual = ZeroMatrix.nullifyMatrix(mat)
    val matExpected = Array(Array(-10, 0, 3), Array(0, 0, 0), Array(7, 0, 9))
    assert(matActual.deep ==  matExpected.deep)
  }

}
