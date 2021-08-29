object Question extends App{

  val p1 = Point(2,5)
  val p2 = Point(6,1)
  print("P1: ")
  println(p1)
  print("P2: ")
  println(p2)

  print("\nP1 + P2 = ")
  println(p1 + p2)

  print("\nAfter moving point P1 by (2,3), the new point: ")
  println(p1.move(2,3))
  print("\nAfter moving point P2 by (5,8), the new point: ")
  println(p2.move(5,8))

  print("\nDistance between P1 and P2: ")
  println(p1.distance(p2))

  print("\nAfter inverting P1: ")
  println(p1.invert())
  print("After inverting P2: ")
  println(p2.invert())
}

case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def +(p:Point):Point = Point(this.x + p.x, this.y + p.y)

  def move(dx: Int, dy:Int):Point = Point(this.x + dx, this.y + dy)

  def distance(p:Point):Double = scala.math.sqrt(scala.math.pow((this.x - p.x),2) + scala.math.pow((this.y - p.y),2))

  def invert():Point = Point(this.y, this.x)
}
