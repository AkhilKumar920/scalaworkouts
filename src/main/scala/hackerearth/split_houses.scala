package hackerearth

object split_houses extends App {
  val t = scala.io.StdIn.readInt()
  val x = scala.io.StdIn.readLine()
  if(x.contains("HH"))println("NO")
  else{
    println("YES")
    println(x.replace(".","B"))
  }
}
