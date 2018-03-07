package chapter1

/**
  * Created by: Angel Ortega
  * Date: 3/6/18
  */
object ZeroMatrix {

  def nullifyMatrix(mat: Array[Array[Int]]) = {

    val zeros = for {
      i <- 0 until mat.length
      j <- 0 until mat(0).length
      element = mat(i)(j);
      if element == 0
    } yield (i, j)



    val rows = Array.ofDim(mat(0).length)
    for ((i, j) <- zeros) {
      for (k <- mat(0).indices) {
        mat(i)(k) = 0
        mat(k)(j) = 0
      }
    }
    mat
  }




}
