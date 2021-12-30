package hackerearth

import scala.io.StdIn.{readInt, readLine}

object digit_cube extends App {
  val t=readInt()
  def cube(a:Long): Long ={
    a*a*a
  }
  def l(a:Long):Long={
    if(a.toString.length>=2){
      a.toString.split("").map(x => x.toLong).sum
    }else a
  }
  for(i<-1 to t) {
    val input = readLine().split(" ").map(x=>x.toLong)
    var n = l(input(0))
    val k = input(1).toInt
    var y:Long = 0
    for(i<-1 to k){
      n=cube(n)
      y=n
      n=l(n)
    }
    println(y)
  }
}
