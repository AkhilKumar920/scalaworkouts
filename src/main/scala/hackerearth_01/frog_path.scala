package hackerearth_01

import scala.io.StdIn.readLine
object frog_path extends App{
  val inp=readLine().split(" ").map(_.toInt)
  var x=inp(0)
  val y=inp(1)
  val s=inp(2)
  val t=inp(3)
  var cnt=0
  for(i<-0 to s){
    for(j<-0 to s){
      if(x+y+j<=t) {
        cnt = cnt + 1
      }
    }
    x=x+1
  }
  println(cnt)
}
