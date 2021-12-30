package hackerearth

import scala.io.StdIn.readLine
object modulo extends App {
  val a=readLine().split(" ")
  val n=a(0).toInt
  val k=a(1).toInt
  val x=readLine().split(" ")
  var p:Long=0
  var m=new Array[Long](n)
  for(i<-0 until n)m(i)=x(i).toLong%k
  var d=m.groupBy(identity).mapValues(_.length).values.toArray
  for(i<-d.indices){
    p=p+d(i)*(d(i)-1).toLong
  }
  print(p)
}
