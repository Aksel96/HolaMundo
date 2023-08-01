fun main(){
    //Crear una lista
    // listOf(valor1,valor2,valor3)
    // var/val listName = listOf(valores)
    // La funcion listOf es una lista inmutable
    var paises = listOf("Argentina","Brasil","Bolivia")
    //Si queremos una lista mutable se usa otra funcion
    var paises2 = mutableListOf("Argentina","Brasil","Bolivia")
    println(paises)
    paises2[0] = "Peru"
    println(paises2[0])


}