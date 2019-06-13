package enumdemo
import enumdemo.EnumDemo.*

class Car(val color:EnumDemo)
{
    fun printColor()
    {
        when(this.color)
        {
            RED -> println("RED")
            GREEN-> println("GREEN")
            YELLOW-> println("YELLOW")
            PINK-> println("PINK")
            PURPLE-> println("Purple")
        }

        println()
    }
}