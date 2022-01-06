package hackerearth_01

import scala.io.StdIn.readLine

object minimize_cost {
  def main(args : Array[String]){
    val nk = readLine.split(" ").map(_.toInt)
    val n = nk(0)
    val k = nk(1)
    val arr = readLine.split(" ").map(_.toInt).toArray
    var st = 0
    for(i <- 0 to (n-1) )
      if(arr(i)>0){
        if(st < i-k) st = i-k
        var dr = min(i+k+1, n)
        while(arr(i) > 0 && st < dr)
          if(arr(st)<0){
            val q = min(arr(i),-arr(st))
            arr(i) = arr(i) - q
            arr(st) = arr(st) + q
            if(arr(st)==0) st = st+1
          }
          else st = st + 1			}
    var sum = 0L
    for(i <- 0 to (n-1))
      if(arr(i)<0) sum = sum - arr(i).toLong
      else sum = sum + arr(i).toLong
    println(sum)
  }
  def min(a : Int, b : Int) : Int = {
    if(a<b) a else b
  }
}
