package genericdemo

fun main() {
    val stack = Stack(1,2,3,4,5,6,7,8,9,10)
    val stack1 = stackOf("A","B","C","D","E","F","G","H","I","G","K","L","M")
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    println(stack1.pop())
    println(stack1.pop())
    println(stack1.pop())
    println(stack1.pop())
    println(stack1.pop())
    println(stack1.pop())
}