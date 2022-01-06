package hackerearth_01

object cost_of_balloons extends App {
  val t=scala.io.StdIn.readInt()
  for(i<-1 to t){
    val cb=scala.io.StdIn.readLine().split(" ")
    val g=cb(0).toInt
    val p=cb(1).toInt
    val g1=cb(0).toInt
    val p1=cb(1).toInt
    var green=0
    var green1=0
    var purple1=0
    var purple=0
    val u=scala.io.StdIn.readInt()
    for(i<-1 to u){
      val x=scala.io.StdIn.readLine().split(" ")
      val x1=x(0).toInt
      val x2=x(1).toInt
      if(x1==1){
        green=green+g
        purple1=purple1+p1
      }
      if(x2==1){
        purple=purple+p
        green1=green1+g1
      }
    }
    val v1=green+purple
    val v2=green1+purple1
    println(List(v1,v2).min)
  }
}
