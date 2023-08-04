package POO.interfaces

fun main(){
    //Interfaces
    val tarjetaUno = MarterCard("12345")
    tarjetaUno.score(51)
    val tarjetaDos = Visa("6789")
    tarjetaDos.score(51)
}

interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MarterCard(override val cardNumber: String) : CreditCard{
    override fun score(age: Int) {
        if(age > 50){
            println("Negativo")
        }else{
            println("Positivo")
        }
    }
}

class Visa(override val cardNumber: String) : CreditCard{
    override fun score(age: Int) {
        if(age > 60){
            println("Negativa")
        }else{
            println("Positiva")
        }
    }

}