package hackerearth_01

import scala.io.StdIn.{readInt, readLine}
object golden_rect extends App {
  val t = readInt
  var cnt = 0
  for (i <- 1 to t) {
    val inp = readLine.split(" ")
    val x = BigDecimal(inp(0))
    val y = BigDecimal(inp(1))
    if(x>y) {
      val z = x / y
      if (z >= 1.6 && z <= 1.7) {
        cnt = cnt + 1
      }
    }else{
      val z = y / x
      if (z >= 1.6 && z <= 1.7) {
        cnt = cnt + 1
      }
    }
  }
  println(cnt)
}
