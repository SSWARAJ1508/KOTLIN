fun main(){
    val simba: Animal = Lion()
    val bruno: Animal = Dog()

    simba.sound()
    bruno.sound()



}

open class Animal {

open fun sound(){
    println(" animal making sound")
}
}

class Lion: Animal() {
 
override fun sound(){

    println("ROARING")
}

}
class Dog: Animal() {
 
    override fun sound(){
    
        println("Barking")
    }
    
    }