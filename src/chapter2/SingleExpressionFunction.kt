package chapter2

fun main() {
    println("multiply with Two=${muliplyWith2(10)}")
}
/*
* Single Expression function is which can return expression only in one line like following
* */

/*
* Inferred type mean compiler now the return and value assigned to val or var in kotlin
* compile now the data type from expression
* if he don't able to understand type then it show error for that expression
* Example
* fun muliplyWith2(number: Int):Int = number * 2
* As you can see I am using return type in following fun implementation
* */


fun muliplyWith2(number: Int) = number * 2