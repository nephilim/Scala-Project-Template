package pis.chap07.m02

object GcdMain extends App {
  println( gcd(10,5))
  
  def gcd(x:Int, y:Int):Int = {
	if(y==0) y
	else gcd(y, x % y)
  }
}




