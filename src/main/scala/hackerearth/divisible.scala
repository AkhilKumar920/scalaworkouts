package hackerearth

object divisible extends App {
  val seed=scala.io.StdIn.readInt()
  val input=scala.io.StdIn.readLine()

  val result=BigInt((input.split(" ").take(seed/2).map(x=>x(0)).mkString(""))
    .concat(input.split(" ").slice(seed/2,seed).map(x=>x(x.length-1)).mkString("")))

  if(result%11==0)println("OUI") else println("NON")
}
