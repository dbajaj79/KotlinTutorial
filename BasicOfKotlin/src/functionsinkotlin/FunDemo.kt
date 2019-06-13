package functionsinkotlin

fun main() {
    val funClassDemo = FunClassDemo()
    println(funClassDemo.funWithParameterAndReturnValue(10,20))
    funClassDemo.funWithoutParameterAndReturn()
    funClassDemo.funWithParamter("Deepak Bajaj")
    println(funClassDemo.funWithReturnValue())

    val sampleList = listOf(1,2,5,7,9,10,16,20)
    val reverseTheListDemo = ReverseTheListDemo()
    println(reverseTheListDemo.reverseOne(sampleList))
    println(reverseTheListDemo.reverseTwo(sampleList))
}