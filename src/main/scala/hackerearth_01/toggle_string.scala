package hackerearth_01

object toggle_string extends App {
  val input=scala.io.StdIn.readLine()
  val n=input.length
  for(i<-0 until n){
    if(input(i)>='A' && input(i)<='Z')print(input(i).toLower)
    else if(input(i)>='a' && input(i)<='z')print(input(i).toUpper)
  }
}
