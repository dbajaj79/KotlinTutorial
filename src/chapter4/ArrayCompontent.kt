package chapter4

fun main() {
    printingWithCompontent()
}

fun printingWithCompontent()
{
    val names = arrayOf("Deepak","Kuldeep","Hardeep","Navdeep","Sandeep")
    println(names.component1())
    println(names.component2())
    println(names.component3())
    println(names.component4())
    println(names.component5())
}