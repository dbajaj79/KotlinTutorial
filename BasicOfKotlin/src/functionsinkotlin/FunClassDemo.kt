package functionsinkotlin

import java.util.*

class FunClassDemo()
{
    fun funWithoutParameterAndReturn()
    {
        println("I am without Return and paramter and less Userfull")
    }
    fun funWithParamter(name:String)
    {
        val greeting="Hello"+name
        println(greeting)

    }
    fun funWithReturnValue()=Date()

    fun funWithParameterAndReturnValue(a:Int,b:Int)=a*b
}