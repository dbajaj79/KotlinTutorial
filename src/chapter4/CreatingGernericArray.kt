package chapter4

fun main() {
    println(createEmptyArray())
}

fun createEmptyArray():Array<String>
{
    var emptyArray: Array<String>
    val names = Array(size = 5,init = { index-> "Item${index*5}"})
    emptyArray = names
    for(i in emptyArray)
    {
        println(i)
    }

    return emptyArray
}