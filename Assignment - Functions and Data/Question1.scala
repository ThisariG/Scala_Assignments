object Question1 extends App{
  val r1 = new RationalNumber(4,6)
  val r2 = new RationalNumber(14,6)
  println(r1)
  println(r2)
  val n1 = r1.neg()
  val n2 = r2.neg()
  println(n1)
  println(n2)
}

class RationalNumber(x:Int ,y: Int){
  require(y >0,"Denominator should be positive")

  def this(x:Int) = this(x,1)

  def num = x/ gcd(Math.abs(x),y)
  def deno = y / gcd(Math.abs(x),y)

  def neg() = new RationalNumber(-this.x, this.y)

  private def gcd(n: Int ,d: Int): Int =
    if(d == 0) n
    else if(n > d) gcd(d, n)
    else gcd(n, d % n)

  override def toString = this.num + "/" + this.deno
}
