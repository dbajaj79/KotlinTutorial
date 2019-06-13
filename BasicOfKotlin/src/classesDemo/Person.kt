package classesDemo

class Person(val name:String,var age:Int)
{
    fun greet(name:String)
    {
        println("Good Morning$name")
    }
    fun speak()
    {
        println("Good Morning Employee")
    }
}