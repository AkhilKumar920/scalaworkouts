package hackerearth_01

import scala.io.StdIn.{readInt, readLine}
object sum_set extends App {
  val n = readInt()
  val x = readLine.split(" ").map(_.toInt)
  val m = readInt()
  val y = readLine.split(" ").map(_.toInt)
  val a=y.max
  var i=1
  var r:String=""
  while(i<=a){
    var q=0
    for(j<-x.indices){
      val p=i+x(j)
      if(y.contains(p)){
        q=q+1
      }else {q=q}
    }
    {
      if (q == x.length) {
        print(i+" ")
      }
    }
    i=i+1
  }
}