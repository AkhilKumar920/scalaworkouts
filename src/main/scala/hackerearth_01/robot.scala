package hackerearth_01

import scala.io.StdIn.readInt
object robot extends App {
  val t=readInt()
  for(i<-1 to t) {
    val n = readInt().toInt
    println((n*n)+n)
  }
}
