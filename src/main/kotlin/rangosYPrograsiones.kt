fun main(){
    // Rangos y Progresiones
    var num = 4
    if(num in 5..20){
        println("El numero se encuentra entre 5 y 20")
    }

    when (num){
        in 5..20 -> println("Rango 5 a 20")
        in 30..40 -> println("Rango 30 a 40")
        else -> {
            println("Numero desconocido")
        }
    }

    var letra = 'f'
    when (letra){
        in 'a'..'m' -> println("Letra entre la a y la m")
        in 'n'..'z' -> println("Letra entre la n y la z")
        else -> {
            println("Letra desconocida")
        }
    }
}