package conditionalstatements

fun main() {
    val monthNumber:Int =15
  println(when(monthNumber)
    {
        0-> "January"
        1-> "Februry"
        2-> "March"
        3-> "April"
        4-> "May"
        5-> "June"
        6-> "July"
        7-> "August"
        8-> "September"
        9-> "October"
        10-> "November"
        11->"December"
      else -> "You Enter Wrong Number"
    })
}