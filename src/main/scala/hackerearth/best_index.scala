package hackerearth

import java.util.Scanner

object best_index extends App {
  val in = new Scanner(System.in)
  val n = in.nextInt();
  val a = Array.ofDim[Long](n)
  //  val a = StdIn.readLine().split(" ").map(_.toInt)
  for (i <- 0 until n)
    a(i) = in.nextInt()

  var lws = Math.sqrt(2 * a.length).floor.toInt // Last window size
  var lastIdx = (lws * (lws + 1)) / 2

  if (lastIdx > a.length) {
    lws -= 1
    lastIdx = (lws * (lws + 1)) / 2
  }

  var cSum: Long = a.sum
  for (i <- lastIdx until a.length)
    cSum -= a(i)

  //  println(a.mkString(" "))
  //  println("0: " + 0 + " " + cSum + " " + lws + " " + lastIdx)
  var biSum: Long = cSum
  //  lastIdx += 1
  for (i <- 0 until a.length - 1) {
    cSum -= a(i)
    //    println(cSum)
    if (lastIdx >= a.length) {
      lastIdx -= lws
      lws -= 1

      lastIdx += 1
      for (i <- lastIdx until a.length)
        cSum -= a(i)
      //      println("1: " + i + " " + cSum + " " + lws + " " + lastIdx)
    } else {
      cSum += a(lastIdx)
      //      println("2: " + i + " " + cSum + " " + lws + " " + lastIdx)
      lastIdx += 1
    }

    //    println(i + " " + cSum)
    if (cSum > biSum)
      biSum = cSum
  }
  println(biSum)
}
