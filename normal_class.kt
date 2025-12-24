fun main(){
val mustang = Car("mustang","petrol",304)
val bettle = Car("bettle","diesel",245)
val tesla = Car("tesla","electric",100)

mustang.start()
bettle.display()
tesla.breaking()

}

class Car(val name:String , val type: String , val kmran: Int){

    fun start(){

        println("CAR is running")
    }
    fun breaking() {
        println("breaks applied")
    }

    fun display(){
        println("name: $name,type:$type,distance ran:$kmran")

    }




}