object Question2 extends App{
  val x = new RationalNumber(3, 4)
  val y = new RationalNumber(5, 8)
  val z = new RationalNumber(2, 7)

  val result = x - y - z
  print(result)
}

class RationalNumber(x:Int ,y: Int){
  require(y >0,"Denominator should be positive")
  def this(x:Int) = this(x,1)

  def deno = y / gcd(Math.abs(x),y)
  def num = x / gcd(Math.abs(x),y)

  def neg() = new RationalNumber(-this.x, this.y)

  private def gcd(n: Int ,d: Int): Int =
    if(d == 0) n
    else if(n > d) gcd(d, n)
    else gcd(n, d % n)

  override def toString = this.num + "/" + this.deno

  def -(n: RationalNumber): RationalNumber = new RationalNumber(this.num * n.deno - this.deno * n.num, this.deno * n.deno)

}
