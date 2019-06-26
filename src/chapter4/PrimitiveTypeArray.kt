package chapter4

fun main() {
    intArray()
    bytArray()
    doubleArray()
    floatArray()
    charArray()
    shortArray()
}
fun shortArray()
{
    println("Printing Short Array")
    val shortArray= shortArrayOf(1,2,3,5,6,7,8,9,10)
    for(i in shortArray)
    {
        println(i)
    }
}

fun intArray()
{
    val intArray=intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Printing Int Array")
    for(i in intArray)
    {
        println(i)
    }
}
fun charArray()
{
    println("Printing Char Array")
    val charArray = charArrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p')
    for(i in charArray)
    {
        println(i)
    }
}
fun floatArray()
{
    println("Printing Float Array")
    val floatArray = floatArrayOf(10f,20.0f,1.5f,1.7f,1.9f,1.8f,1.60f)
    for(i in floatArray)
    {
        println(i)
    }
}
fun doubleArray()
{
    println("Printing Double Array")
    val doubleArray = doubleArrayOf(100.0,23.0,56.0,67.0,78.0,89.0,90.8,45.90,89.00)
    for(i in doubleArray)
    {
        println(i)
    }
}
fun bytArray()
{
    val byteArray = byteArrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Printing Byte Array")
    for(i in byteArray)
    {
        println(i)
    }
}