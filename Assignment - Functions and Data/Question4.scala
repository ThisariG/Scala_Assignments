object Question4 extends App{

  val accountList = List(
    new Account("995451875v", 1111, 50000),
    new Account("963782501v", 2222, 10000),
    new Account("896522621v", 3333, -5000),
    new Account("963782501v", 4444, 15000),
    new Account("995451875v", 5555, 1000),
    new Account("963782501v", 6666, 35000),
    new Account("995451875v", 7777, -20000),
    new Account("963782501v", 8888, -6000),
    new Account("995451875v", 9999, 25000),
    new Account("963782501v", 1122, 4000),
    new Account("995451875v", 1133, -9000),
    new Account("963782501v", 1144, -1000)
  )

  //Question 4.1
  //getting accounts with negative balances
  val overdraft = accountList.filter(b=>b.balance < 0)
  println("Accounts with negative balances: ")
  overdraft.foreach(println)

  //Question 4.2
  //getting the total balance
  val sumBalance = accountList.map((a: Account)=> a.balance).reduce((x,y)=> x + y)
  println(f"\nSum of the balances: ${sumBalance}%.2f")

  //Question 4.3
  println("\nAccount balance before applying interest: ")
  accountList.foreach(println)

  for(a<- accountList){
    if (a.balance > 0) a.balance = 1.05 * a.balance
    else a.balance = 1.1 * a.balance
  }

  println("\nAccount balance after applying interest: ")
  accountList.foreach(println)


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
