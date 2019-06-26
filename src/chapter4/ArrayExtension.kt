package chapter4

fun main()
{
    averageExtension()
    minExtension()
    maxExtension()
    firstExtension()
    lastExtension()
    sortExtension()
    sortDesendingExtension()
}
fun averageExtension()
{
    val intArray = intArrayOf(1,2,3,4,5,6,7,9,10,40,90)
    val shortArray = shortArrayOf(10,56,89,70,79,80,45)
    val doubleArray= doubleArrayOf(6.0,78.0,90.0)
    val byteArray = byteArrayOf(1,2,3,4,5,6,7)
    println("Average of Int Array ${intArray.average()}")
    println("Average of short Array ${shortArray.average()}")
    println("Average of double Array ${doubleArray.average()}")
    println("Average of byte Array ${byteArray.average()}")
}

fun maxExtension()
{
    val intArray = intArrayOf(1,2,3,4,5,6,7,9,10,40,90)
    val shortArray = shortArrayOf(10,56,89,70,79,80,45)
    val doubleArray= doubleArrayOf(6.0,78.0,90.0)
    val byteArray = byteArrayOf(1,2,3,4,5,6,7)
    println("Max Element  of Int Array ${intArray.max()}")
    println("Max Element of short Array ${shortArray.max()}")
    println("Max Element  of double Array ${doubleArray.max()}")
    println("Max Element of byte Array ${byteArray.max()}")
}

fun minExtension()
{
    val intArray = intArrayOf(10,4,3,4,5,6,7,9,10,40,90)
    val shortArray = shortArrayOf(10,56,89,70,79,80,45)
    val doubleArray= doubleArrayOf(6.0,78.0,90.0)
    val byteArray = byteArrayOf(1,2,3,4,5,6,7)
    println("Min Element of Int Array ${intArray.min()}")
    println("Min Element  of short Array ${shortArray.min()}")
    println("Min Element  of double Array ${doubleArray.min()}")
    println("Min Element  of byte Array ${byteArray.min()}")

}

fun lastExtension()
{
    val intArray = intArrayOf(10,4,3,4,5,6,7,9,10,40,90)
    val shortArray = shortArrayOf(10,56,89,70,79,80,45)
    val doubleArray= doubleArrayOf(6.0,78.0,90.0)
    val byteArray = byteArrayOf(1,2,3,4,5,6,7)
    println("Last Element of Int Array ${intArray.last()}")
    println("Last Element  of short Array ${shortArray.last()}")
    println("Last Element  of double Array ${doubleArray.last()}")
    println("Last Element  of byte Array ${byteArray.last()}")

}

fun firstExtension()
{
    val intArray = intArrayOf(10,4,3,4,5,6,7,9,10,40,90)
    val shortArray = shortArrayOf(10,56,89,70,79,80,45)
    val doubleArray= doubleArrayOf(6.0,78.0,90.0)
    val byteArray = byteArrayOf(1,2,3,4,5,6,7)
    println("First Element of Int Array ${intArray.first()}")
    println("First Element  of short Array ${shortArray.first()}")
    println("First Element  of double Array ${doubleArray.first()}")
    println("First Element  of byte Array ${byteArray.first()}")


}
fun sortExtension()
{
    val intArray = intArrayOf(10,4,3,4,5,6,7,9,10,40,90)
    println("Before Sorting")
    for(i in intArray)
    {
        print("\t$i\t")
    }
    println("After Sorting")
    for (i in intArray.sorted())
    {
        print("\t$i\t")

    }
}
fun sortDesendingExtension()
{
    val intArray = intArrayOf(10,4,3,4,5,6,7,9,10,40,90)
    println("Before Decending Sorting")
    for(i in intArray)
    {
        print("\t$i\t")
    }
    println("After Decending  Sorting")
    for (i in intArray.sortedDescending())
    {
        print("\t$i\t")

    }
}
