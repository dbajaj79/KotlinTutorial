package chapter3

fun main() {
    escapedString()
    rawString()
}
/*
* Escaped String is String Literal in Kotlin
* It contain escape character is String like $ ' " \n \t etc
* Delimiter for Escape String ""
* See Following Example :-
*
* */
fun escapedString() {
    println("Hello World \nwith NewLine ")
    println("Hello World with \t Tab")
    println("Hello World with \r Caret Return")
    println("\'Hello World\' with \' Character")
    println("\$HelloWorld with \$ Character")
    println("\"Hello World\" Within\" Character")


}
/*
* What is Raw String in Kotlin
*Raw String is a String literal in Kotlin which doesn't contain any escape character in String
* It start and End with """ """
* Like following example
* */
fun rawString() {
   val rawString= """fun print()
        |{
        |println($"Hello From Raw String")
        |}
    """.trimMargin()

    println(rawString)
}