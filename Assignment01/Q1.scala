object Q1 extends App{
  def convertToFahrenheit(celsius:Double)= celsius * 1.8000+32.00;
  val celsius:Double = 35.00;
  println(s"${celsius} in Celsius is equal to ${convertToFahrenheit(celsius)} in Fahrenheit");
}