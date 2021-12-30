package hackerearth

object profile_picture extends App {
  val l=scala.io.StdIn.readInt()
  val n=scala.io.StdIn.readInt()

  for(i<-1 to n){
    val input=scala.io.StdIn.readLine().split(" ")
    val w=input(0).toInt
    val h=input(1).toInt
    if(w>=l && h>=l){
      if(w==h)println("ACCEPTED")
      else println("CROP IT")
    }else println("UPLOAD ANOTHER")
  }
}
