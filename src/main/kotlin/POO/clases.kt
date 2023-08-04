package POO
fun main(){
    // Creando una clase
    // class Nombre { // Cuerpo de la clase}

    //Instancia de clase
    // val nombre = Clase()
    val auto = Car(2022,"Rojo","Sedan") //Objeto tipo Car
    println(auto.year) // Ver sus atributos
    println(auto.color)
    println(auto.model)

    val autoDos = Car(2019,"Negro","Hatchba")
    println(autoDos.year) // Ver sus atributos
    println(autoDos.color)
    println(autoDos.model)

    autoDos.encender()
    autoDos.apagar()



}
// Version sin contructor
//class Car{
//    val  year = 2022
//    val color = "Red"
//    val model = "Sedan"
//}

//Clase con Constructor
class Car(val year : Int, val color: String, val  model: String){
    //Bloque Init
    init {
        val antiguedad = 2023 - year
        println("La antiguedad es de $antiguedad años")
    }

    // Member functions
    fun encender (){
        println("${this.model} Engine Start....")
    }
    fun apagar(){
        println("${this.model} Engine off....")
    }
}