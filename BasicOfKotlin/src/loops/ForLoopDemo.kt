package loops

fun main() {
    println("Simple For Loop")
    val numberRange  = IntRange(1,10)

    for((i,j)in numberRange.withIndex())
    {
        println("Value of index$i is=$j")
    }

}