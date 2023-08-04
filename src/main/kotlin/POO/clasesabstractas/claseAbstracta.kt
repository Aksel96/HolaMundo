package POO.clasesabstractas

fun main(){
    val credit = UserInfo()
    println(credit.creditID())
    credit.newCard()
}

abstract class CreditCard{
    fun creditID():String{
        return "12345"
    }
    abstract fun newCard()
}

class  UserInfo: CreditCard(){
    fun getInfo(): String{
        return creditID()
    }

    override fun newCard() {
        println("New card created!")
    }
}