object Question3 extends App{

  val a1 = new Account("995451875v", 1111, 50000)
  val a2 = new Account("963782501v", 2222, 10000)

  println("Before Transfering: ")
  println(a1)
  println(a2)

  a1.transferAmount(a2, 5000)
  println("\nAfter Transfering Rs.5000: ")
  println(a1)
  println(a2)
}

class Account(id: String, accNo: Int, b: Double){
  var NIC: String = id
  var accountNo: Int = accNo
  var balance: Double = b

  def withdraw(amount:Double) = this.balance = this.balance - amount

  def deposit(amount:Double) = this.balance = this.balance + amount

  def transferAmount(account: Account, amount:Double) = {
    this.withdraw(amount)
    account.deposit(amount)
  }

  override def toString = f"${this.NIC}%s : ${this.accountNo} : ${this.balance}%.2f"

}
