object Q4 extends App{
  def isOddEven(n:Int):Any = n match {
    case 0 => print("Even")
    case 1 => print("Odd")
    case _ => isOddEven(n - 2)
  }
  print("5 => "); isOddEven(5)
  print("\n6 => "); isOddEven(6)

}