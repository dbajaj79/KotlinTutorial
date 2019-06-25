package chapter3

fun main() {
    val name = "I am Learning kotlin"
    printArrayUsingIndex(name)
    printArrayUsingLoop(name)
}
/*
* String is collection of Character which called elements of String
* you can print string using for each loop and Indexing
* See Example Below
* */
fun printArrayUsingLoop(args:String)
{
    for(i in args)
    {
        println(i)
    }

}
fun printArrayUsingIndex(args:String)
{
    println(args[0])
    println(args[1])
    println(args[2])
}