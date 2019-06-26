package chapter3

fun main() {

    println("Enter First String")
    val string1= readLine()
    println("Enter Second String")
    val string2 = readLine()

    println("Check Value Equality of String using==Operator=${checkStirngElementEquality(string1!!,string2!!)}")

}
/*
* String equality checked using == operator
*
* See Following Example
* */
fun checkStirngElementEquality(one:String,two:String)=one==two

