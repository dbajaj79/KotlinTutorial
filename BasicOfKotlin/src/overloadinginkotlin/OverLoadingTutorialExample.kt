package overloadinginkotlin

abstract class Course(val name:String,var price:Int)
{
    open fun learn()
    {
        println("Learning $name is awesome Experience")
    }
}
interface LearnAble
{
    fun learn()
    {
        println("I am from Learnable")
    }
}
class KotlinCourse : Course("Kotlin",999),LearnAble
{
    override fun learn() {

       //To Avoid Ambiguity Problem
        //super<LearnAble>.learn()//To Tell this is Method Call for Learnable
        super<Course>.learn()//To Tell this is Method call for Learnable
        println("I am Learn Implementation in Child Class")
    }

}

fun main() {
    val kotlinCourse = KotlinCourse()
    kotlinCourse.learn()
}
