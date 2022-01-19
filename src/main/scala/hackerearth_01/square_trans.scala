package hackerearth_01

import scala.io.StdIn._
object square_trans extends App {
  val t=readInt()
  val a=readLine().split(" ").map(_.toInt)
  val q=readInt()
  for(i<-1 to q){
    val y=readInt()
    var cnt=0
    var tr=0
    for(i<-0 until t){
      cnt=cnt+a(i)
      if(cnt<y){
        tr=tr+1
      }
    }
    if((tr+1)>t){
      println(-1)
    }else
    println(tr+1)
  }
}
