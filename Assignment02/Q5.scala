object Q5 extends App{
  def isEven(n:Int):Boolean = n match {
    case 0 => true
    case 1 => false
    case _ => isEven(n - 2)
  }

  def evenSum(n:Int):Int = n match {
    case 0 => 0
    case n if(isEven(n)) => n + evenSum(n - 1)
    case n if(!isEven(n)) => evenSum(n - 1)
  }
  val n = 10
  println(s"Sum of all even numbers less than ${n}: ${evenSum(n - 1)}")
}
