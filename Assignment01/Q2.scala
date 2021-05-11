object Q2 extends App{
  def calculateVolume(radius:Double):Double= (4.0/3.0) * math.Pi * math.pow(radius,3);

  val radius:Double = 5.0;

  println(s"Volume of a sphere of radius ${radius} is ${calculateVolume(radius)}")
}