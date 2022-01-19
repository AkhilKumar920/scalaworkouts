package hackerearth_01

import scala.io.StdIn.readInt
object spclnum extends App{
  val t=readInt()
  for(_<-1 to t){
    var a=readInt()
    var x=0
    while(x>=0){
      if((a.toString.sum)%4==0){
        println(a)
        x= -1
      }else{
        x=x+1
        a=a+1
      }
    }
  }
}
