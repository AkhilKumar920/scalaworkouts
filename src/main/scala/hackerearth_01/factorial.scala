package hackerearth_01

object factorial extends App {
  val n=scala.io.StdIn.readInt()
  var a=1
  for(i<-1 to n){
    a=a*i
  }
  println(a)
}
