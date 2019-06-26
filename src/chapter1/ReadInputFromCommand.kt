package chapter1

fun main() {
    println("Enter Two Number with Space in Between")

    var(a,b)= readLine()!!.split(" ")
    println("Greater Number in Between=${max(a.toInt(),b.toInt())}")
}
fun max(a:Int,b:Int):Int
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}