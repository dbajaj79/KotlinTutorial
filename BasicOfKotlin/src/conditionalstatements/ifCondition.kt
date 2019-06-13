package conditionalstatements

fun main() {
    val age = 16
    if (age < 18) {
        println("You can't Register")
    } else if (age > 23) {
        println("May be You can Register")
    } else {
        println("Wow!,Welcome you can register")
    }
}