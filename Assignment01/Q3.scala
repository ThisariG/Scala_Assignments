object Q3 extends App{

  def calculateDiscount():Double = 24.95 * 0.6

  def calculateTotalDiscountedPrice(noOfCopies:Int) = calculateDiscount * noOfCopies

  def calculateShippingCost(noOfCopies:Int):Double =
    if (noOfCopies > 50)
      (3 + (noOfCopies - 50) * 0.75)
    else
      3

  def calculateWholesaleCost(noOfCopies:Int):Double = calculateTotalDiscountedPrice(noOfCopies) + calculateShippingCost(noOfCopies)

  val noOfCopies:Int = 60

  println(s"The total wholesale cost of ${noOfCopies} books is ${calculateWholesaleCost(noOfCopies)}")
}


