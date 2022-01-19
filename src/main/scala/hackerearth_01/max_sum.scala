package hackerearth_01

import scala.io.StdIn.{readInt, readLine}
object max_sum extends App {
  val n=readInt()
  val l=readLine.split(" ").map(_.toLong)
  var count=0
  var sum:Long=0
  for(i<-0 until n){
    if(l(i)>=0){
      count=count+1
      sum=sum+l(i)
    }
  }
  if(sum>0){
    print(sum+" "+count)
  }else {print(l.max+" "+1)}
}
