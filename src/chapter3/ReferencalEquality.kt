package chapter3

fun main() {
    println("Enter First String")
    var string1= readLine()
    println("Enter Second String")
    var string2 = readLine()
    val string3=string1
    checkReferencEQuality(string1!!,string2!!,string3!!)

}
/*
* This Method is Check the Working of Reference  equality operator(===)of Two String using
*
* */
fun checkReferencEQuality(string1:String,string2:String,string3:String)
{
    println("String1 and String 2=${string1==string2}")
    println("String2 and String 3=${string2==string3}")
    println("String3 and String 1=${string1==string3}")
}