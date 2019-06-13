package overloadinginkotlin

abstract open class Bank(open val name:String, open val address:String, open val city:String, open val country:String)
{
    abstract fun openAccount()
    open fun closeAccount()
    {
        println("I am Parent Close Method")
    }

}

interface IAccount
{
    fun closeAccount()
}


open class HDFC(override val name: String,override val address: String,override val  city: String,override val country: String):
    Bank(name,address,city,country), IAccount
{
    override final fun openAccount() {

        println("Account is Opening in $name in Branch Name:$city, Address:$address,$country")
    }
    override fun closeAccount()
    {
        super.closeAccount()

    }

}

class HDFCLoan(override val name:String,override val  address: String,override val city: String,override  val country: String) : HDFC(name,address,city,country)
{
    //You can avoid overiding of fun in child class using final keyword with fun name
   /* override fun openAccount() {
        println("You Want Loan from $name in Branch Name:$city, Address:$address,$country")
    }*/

}


//Ambiguity Problem in Kotlin
