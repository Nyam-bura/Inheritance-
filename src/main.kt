fun main() {
    var banker = Banker("Jane", 20)
    var farmer = Farmer("Wanjala", 28)
    var doctor = Doctor("Rachael", 28)


    doctor.eat()
    doctor.introduction()



}


open class Person(var name: String, var age: Int) {
    fun talk(words: String) {
        println(words)
    }

   open fun eat() {
        println("yum")
    }
    open fun introduction(){
      println("Hi my name is doctor $name")
    }

    fun sleep() {
        println("zzzzzzz")
    }
}

class Banker( name: String, age: Int) : Person(name, age) {
    fun countMoney(notes: Array<Int>): Int {
        return notes.sum()
    }
}

class Doctor( name: String, age: Int):Person(name,age) {


    fun treatPatient(patient: String, disease: String) {
        println("Treating $patient for $disease")
    }

    override fun introduction() {
        println("Hi my name is  DR. $name")
    }




}
//create a function called Introduction but will print out
//"Hi my name is ..."for each of your classes.




class Farmer( name: String,  age: Int):Person(name,age) {


    fun cultivateLand() {
        println("dig,dig,dig,dig")
    }



   // override fun eat() {
        //super.eat()
        //println("I am eating all the food that i've grown")
    //}
}