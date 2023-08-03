fun main(){
    // for loops
    // for( i in 1..4) { Codigo }
    for(i in 1..4){
        println("$i - Hola mundo")
    }

    //Iteracion de colleciones
    // para iterar los sets es igual que con las listas
    val listaPersonajes = listOf("Spiderman","Wolverine","Ironman")
    //iterar en la collecion tambien con el indice
    for ((indice, personaje) in listaPersonajes.withIndex()){
        println("$indice -  $personaje")
    }

    //Iteracion de Maps
    val user = mapOf("name" to "juan", "pass" to "123")

    for (item in user){
        println("${item.key} : ${item.value}")
    }


}