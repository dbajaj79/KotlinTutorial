package chapter2

fun main() {
    val number=10
    println("I am Example of String Interpolation for Single Variable=$10")
    println("I am Example of String Interpolation for Expression=${number*10+5}")
    println("I am Example of String Interpolation for fun=${addTen(50)}")
}
fun addTen(a:Int):Int
{
    return a+10
}
