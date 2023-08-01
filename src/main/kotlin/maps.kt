fun main(){
    // Coleccion de clave valor, cada clve es un solo valor
    //Creando un map
    // mapOf(key1 to val1, key2 to val2)
    // var/val mapName = mapOf(key1 to val1, key2 to val2)
    //Son inmutables
    var datosUsuario = mapOf("name" to "juan","pass" to "1234")
    println(datosUsuario)

    //Acceder a los datos
    println(datosUsuario["name"])
    // Imprimir las llaves
    println(datosUsuario.keys)
    // Imprimir los valores
    println(datosUsuario.values)

    // maps mutables
    var datosUsuario2 = mutableMapOf("name" to "juan","pass" to "1234")

    //modificar valores
    // No se pueden modificar las keys solo los valores
    datosUsuario2["name"] = "jhon"
    println(datosUsuario2["name"])

}