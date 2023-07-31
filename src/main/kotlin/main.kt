fun main(){
    print("Hola mundo")
    // Declaracion de variables
    // var nombreVariable: Tipo de dato = valor
    var saludos: String = "Hola mundo" //Declaracion de una variable modificable
    print(saludos)
    val PI: Double = 3.14 // Variable que NO puede ser modificada
    println(PI)

    //Inferencia de tipos

    var saludos2 = "Hola mundo!" //No es necesario poner el tipo
    //Cada variable solo puede tener un tipo
    println(saludos2)

    //Variables de tipo texto
    var nombre = "Peter"
    var apellido = "Parker"
    //Concatenacion de cadenas con platillas / templates
    println("$nombre $apellido")

    //Variables tipo numero
    var numero1 = 7
    var numero2 = 2
    //Operaciones matematicas
    //Asi se usa el template para hacer operaciones
    //Se encierran las variables en unas llaves {}
    println("Suma: ${numero1 + numero2}") //Se efecua la suma
    println("Resta: ${numero1 - numero2}") //Se efectua la resta
    println("Multiplicacion ${numero1 * numero2}") //Multiplacacion
    println("Division ${numero1 / numero2}") //Division
    println("Modulo: ${numero1 % numero2}") //Modulo ( residuo )

    // Nulleables en Kotlin
    //Para declarar una variable que podria contener un nulo ponemos un "?"
    var nombreNull: String?
    nombreNull = null
    //nombreNull = "Peter"
    //Para que no se rompa el programa por recibir un nulo
    var longitud : Int? = nombreNull?.length

    //Si queremos sacar una excepcion se pone doble !!
    //var longitud : Int? = nombreNull!!
    println(longitud)

    //Elvis operator
    // se usa para que en caso de que llegue un nulo el operador lo trasforma a otro valor que le pongamos
    var nombreElvis: String?
    nombreElvis = null ?: "Usuario"
    var longitudElvis: Int? = nombreElvis?.length ?: 0
    println("Hola $nombreElvis tu nombre tiene $longitudElvis letras")


}