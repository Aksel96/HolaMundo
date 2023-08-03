fun main(){
    // Creando y llamando a una funcion
    saludos()

    //Argumentos
    multiplicacion(5,7)

    // Argumentos por default y por nombre
    saludos2("Peter","Parker")
    saludos2(apellido = "Parker", nombre = "Peter") // Por Nombre
    saludos2(nombre = "Peter") //Argumentos por default Se pone el apellido declarado en la funcion

    // Return en las funciones
    var suma = suma(15,15)
    println(suma)

    // Funciones literales:
    //Funcion anonima
    println(multi(5,5))
    // Expresion lamda
    println(multiLamda(3,4))
}

fun saludos(){
    println("Saludos desde la funcion")
}

fun multiplicacion(num1: Int , num2:Int){
    var resultado = num1 * num2
    println("Resultado: $resultado")
}

fun saludos2(nombre: String, apellido: String = "Sin apellido"){
    println("Hola $nombre $apellido")
}

fun suma(a: Int , b: Int) : Int {
    return a + b
}

// Funcion Anonima
var multi = fun(a: Int, b: Int) : Int {
    return a * b
}

// Expresion Lamda
var multiLamda = {a: Int, b:Int -> a * b}