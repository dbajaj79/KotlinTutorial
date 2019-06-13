package classesDemo.inhritance

class Dog(override val color:String,override var age:Int,override val breed:String,override var type:String):Animal(color,age,breed,type) {
    override fun speak() {
        println("Woo Woo")
    }
    override fun eat()
    {
        println("$type is Eat Bones")

    }
}