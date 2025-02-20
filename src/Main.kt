

//this is how class is written
open class Car{
    class car()
    val brand="mazda "
    val model="vt"

    fun choose(){
    val year=2020

    }

}
//this is how inheritance is done
class carType: Car(){

    fun myfunc(){
        println("this is the function i am witting in kotlin ")

    }
}
//main function
fun main() {

    println("here is the introduction  ")


    add(10,20)
    var firstObject= Car() //calling for that obects
    println(firstObject) // printing objects in the screen

    var second=carType()
    println("second object is written as$second")
    second.myfunc()
}
//add function
fun add(x:Int,y:Int){
    println(x+y)
    //data type
    //int,string ,booleam,float

}


