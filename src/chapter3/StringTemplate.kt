package chapter3

fun main() {
    println("Enter First Number")
    val number= readLine()!!.toInt()
    println("Enter Second Number")
    val number1 = readLine()!!.toInt()
    /*
* Template is string which contains expression
* Expression is evaluate First
* Concatenate  with String
* Like Following Example:-
* */

    println("String Template=To Check Greater Number=${checkGreater(number,number1)}")
}
fun checkGreater(number:Int,number1:Int):Int
{
    if(number>number1)
    {
        return number
    }
    else
    {
        return number1
    }
}