package loops

fun main() {
    outer@ for(i in 1..10)
    {
        for(j in 1..10)
        {
            if(j-i==6)
            {
                break@outer
            }
            println("Value of I=$i,Value of J=$j")
        }
    }
}