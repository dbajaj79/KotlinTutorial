package conditionalstatements

import java.util.*

fun main() {
    val random = Random().nextInt(50)
    print(
        when (random) {
            in 1..10 -> "Number between 1 to 10 and Number is $random"
            in 10..20 -> "Number between 10 to 20 and Number is $random"
            in 20..30 -> "Number Between 20 to 30 and Number is $random"
            in 30..40-> "Number Between 30 to 40 and Number is $random"
            in 40..50-> "Number Between 40 to 50 and Number is $random"
            else -> "Number is Invalid"

        }
    )
}