package chapter1

class HelloWorldWithCampanion {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World From Companion Object")
        }
    }
}