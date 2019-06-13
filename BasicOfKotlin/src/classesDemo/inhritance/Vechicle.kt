package classesDemo.inhritance

open class Vechicle (open val color:String,open val model:String,open val manufacturer:String,open val name:String)
{


    fun breakSystem()
    {
        println("Break Applied in $name")
    }

    fun changeGear()
    {
        print("Gear is Changed of $name")
    }

}