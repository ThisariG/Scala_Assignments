object Q3 extends App{
  def sum(n: Int):Int =n match {
    case 1 => 1
    case _ => n + sum(n - 1)
  }

  println(s"Sum from 1 to 5 is ${sum(5)}")
}