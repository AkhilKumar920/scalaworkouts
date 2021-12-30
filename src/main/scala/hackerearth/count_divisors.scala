package hackerearth

object count_divisors extends App {
  val input=scala.io.StdIn.readLine().split(" ")
  val l=input(0).toInt
  val r=input(1).toInt
  val k=input(2).toInt
  var a=0

  for(i<-l to r){
    if(i%k==0){
      a=a+1
    }
  }
  println(a)
}
