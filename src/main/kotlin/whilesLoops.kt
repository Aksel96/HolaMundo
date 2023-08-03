fun main(){
    //While Loop

    var num = 1

    while (num < 2) {
        println("Es una linea")
        num += 1
    }

    // do.. while

    var suerte = 10

    do {
        println("Ingresa tu numero:")
        var numero = readLine()!!.toInt()
        if (numero > suerte){
            println("Tu numero es muy alto")
        }
        if(numero < suerte){
            println("Tu numero es muy bajo")
        }
        if (numero == suerte){
            println("Ganaste!")
        }
    }while (suerte != numero)

    // Loops Anidados

    for (i in 1..4){
        print("Fila $i - ")
        for (j in 1..4){
            print("$j")
        }
        println(" * ")
    }


}