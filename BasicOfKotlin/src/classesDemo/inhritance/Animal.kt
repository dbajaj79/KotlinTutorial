package classesDemo.inhritance

abstract class Animal(open val color:String,open var age:Int,open val breed:String,open var type:String)
{
    open fun eat()
    {
        print("$type type of $breed is Eating")
    }
    abstract fun speak()
}