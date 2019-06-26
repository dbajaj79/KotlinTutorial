package chapter4

fun main() {
    iteratoroverarray()
    printArrayElementOneByOne()
}

fun iteratoroverarray()
{
    val genericArrayType = arrayOf("String",1,'a',6f,8.0,"Second String")
    for(i in genericArrayType)
    {
        println(i)
    }
}
fun printArrayElementOneByOne()
{
    val genericArray =arrayOf("Deepak",'a',1,6f,8.0,"hello","sandeep")
    println(genericArray[0])
    println(genericArray[1])
    println(genericArray[2])
    println(genericArray[3])
    println(genericArray[4])
    println(genericArray[5])
    println(genericArray[6])


}
