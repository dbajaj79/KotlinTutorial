package chapter4

fun main() {
    println(createEmptyArray()[0])
}

fun createEmptyArray():Array<String>
{
    var emptyArray = emptyArray<String>()


    return emptyArray
}