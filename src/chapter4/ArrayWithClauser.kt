package chapter4

fun main() {
arrayWithClauser()
}
fun arrayWithClauser()
{
    val array = Array(3){i -> i*3 }
    val stringArray = Array<String>(5){i-> "Item ${i*5}"}
    for(i in array)
    {
        println(i)
    }
    for (i in stringArray)
    {
        println(i)
    }
}

