package chapter1
/*
* The Advantage of this thing over toplevel function is that you can define more function in this scope
* */
class HelloWorldWithCampanion {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World From Companion Object")
            HelloWorldWithCampanion().run()
        }
    }
    fun run()
    {
        println("I am Hello World From Run Function")
    }
}