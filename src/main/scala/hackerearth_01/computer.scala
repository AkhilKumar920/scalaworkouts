package hackerearth_01

import scala.io.StdIn.{readInt, readLine}

object computer extends App {
  val t=readInt()
  for(i<-1 to t){
    val data=readLine().toDouble
    val ref=math.sqrt(data).toInt
    var i=1
    var x=0
    while(i<=ref){
      i=i*2
      if(data/i>=i/2){
        x=(data-data/2).toInt
      }else{
        x=(data-(i/2)+1).toInt
      }
    }
    println(x)
  }
}
