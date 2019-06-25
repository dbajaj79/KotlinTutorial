package chapter2

fun main() {
    printHello("Unit is Default Return type of fun in Kotlin \n That why Unit is showing Dim color and \nGive Redundant Warning ")
}
fun printHello(value:String):Unit
{
    println(value)
}