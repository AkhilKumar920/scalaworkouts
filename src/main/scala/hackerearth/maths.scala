package hackerearth

import scala.io.StdIn.{readInt, readLine}
object maths extends App {
  val t=readInt()
  for(i<-1 to t){
    val input=readLine().split(" ")
    var x=input(0).toLong
    val k=input(1).toInt
    var y="YES"
    while(x>0) {
      if (x % k >= 2) {
        y="NO"
        x=0
      } else{
        x=x/k
      }
    }
    println(y)
  }
}
