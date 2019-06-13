package collections

fun main() {
    val array1 = arrayOf("Good",1,10f,'A',true)
    //Methods of Array
    println("Size Method")
    println("Size of Array:"+array1.size)
    println("IsEmpty")
    println(array1.isEmpty())
    println("Is No Empty")
    println(array1.isNotEmpty())
    println("IsNull or Empty")
    println(array1.isNullOrEmpty())
    println("Contains Method")
    println(array1.contains('A'))
    println("LastIndex")
    println(array1.lastIndex)
    println("First Element")
    println(array1.first())

}