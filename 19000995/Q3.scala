object Q3 extends App
{
    val A1 = new Account("983132383V" , 1122 , 456837)
    val A2 = new Account("98312384V" , 1123 , 38485)
    println("Balance of A2 is "+A1.transfer(1000, A2))

}


class Account ( x:String , y: Int , z : Double)
{

    val NIC : String = x
    val accountNumber : Int = y
    var balance : Double = z

    def withdraw( amount : Double ) = this.balance -= amount

    def deposit ( amount : Double ) = this.balance += amount

    def transfer( amount : Double , that : Account ): Double = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
        that.balance
    }


    @Override
    override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance

}
