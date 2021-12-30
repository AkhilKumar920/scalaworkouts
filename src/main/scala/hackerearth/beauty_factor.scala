package hackerearth

import scala.io.StdIn.readLine
object beauty_factor extends App {
  val n=readLine().split(" ").map(_.toInt)
  val a=n(0)
  val b=n(1)
  var arr:Array[Int]=Array(0)
  val x=Array.fill(b)(1).mkString("").toInt
  val y=Array.fill(b)(9).mkString("").toInt
  var count=0
  for(i<-x to y) {
    val z = i.toString
    var cnt = 0
    for (i <- 0 until b) {
      val z1 = z.drop(i + 1)
      if (z1.contains(z(i))) {
        cnt = 0
      } else {
        cnt = cnt + z(i).toString.toInt
      }
      if (cnt.toString.length >= 2) {
        val l = cnt.toString
        var ct = 0
        for (i <- 0 until l.length) {
          ct = ct + l(i).toString.toInt
        }
        count=ct
      }
      else {
        count = cnt
      }
    }
    if(count==a){
      println(i)
    }
  }
  println(arr.min)
}
