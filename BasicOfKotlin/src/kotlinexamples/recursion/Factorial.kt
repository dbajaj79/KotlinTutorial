package kotlinexamples.recursion

fun main() {

    println("Enter a Number")
    val number = readLine()!!.toInt()
    println(factorial(number))

}
fun factorial(n:Int):Long
{
    if(n==1)
    {
        return n.toLong()
    }
    else
    {
        return  n* factorial(n-1)
    }
}