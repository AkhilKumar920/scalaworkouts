package hackerearth

object no_of_steps extends App {
  val n=scala.io.StdIn.readInt()
  val a=scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val b=scala.io.StdIn.readLine().split(" ").map(_.toInt)
  var count=0
  var least=a.min
  var i=0
  while(i<n){
    if(a(i)>=b(i)){
      while(a(i)>least){
        a(i)=a(i)-b(i)
        count=count+1
      }
      if(a(i)<least){
        least = a(i)
        i = 0
      }
      else i=i+1
    }
    else{
      count= -1
      i=i+n
    }
  }
  print(count)
}
