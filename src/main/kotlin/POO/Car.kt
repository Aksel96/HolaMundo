package POO

open class CarHerencia(val year: Int , val model:String, val color:String){
    fun encender(){
        println("Engine Start...")
    }
    fun apagar(){
        println("Engine Off...")
    }

}