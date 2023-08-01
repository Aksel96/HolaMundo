fun main(){
    //Creando un sett
    // setOf(valor1,valor2)
    // var/val setName = setOf(valor1,valor2)
    // Es una lista sin elementos duplicados, un conjunto desordenado de elemtentos unicos
    // Si le das duplicados al mostrar solo se muestra uno
    // los duplicados no se guardan
    var paises = setOf("Argentina","Brasil","Bolivia")

    //Mostrar un indice en especifico
    println(paises.elementAt(1))

    //se necesita tambien una funcion diferente si quieres un set mutable
    var paises2 = mutableSetOf("Argentina","Brasil","Bolivia")
    // Remover un elemento
    paises2.remove("Argentina")
    println(paises2)

}