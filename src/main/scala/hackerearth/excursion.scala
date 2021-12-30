package hackerearth

import scala.io.StdIn.{readInt, readLine}

object excursion extends App {
  val t=readInt()
  def cnt(a:Int,b:Int): Int = {
    if (a > b) {
      if (a%b == 0) {
        a / b
      } else
        (a / b) + 1
    } else if (a == 0){
      0
    }else 1
  }
  for(i<-1 to t){
    val input=readLine().split(" ")
    val n=input(0).toInt
    val m=input(1).toInt
    val k=input(2).toInt
    println(cnt(n,k)+(cnt(m,k)))
  }
}
