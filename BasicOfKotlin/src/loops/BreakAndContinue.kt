package loops

fun main() {
    println("Break And Continue")
    println(" ")
    println("Break")
    for(i in 1..10)
    {
        if(i==5)
        {
            break
        }
        println(i)
    }
    println("Continue")
    for(j in 1..10)
    {
        if(j==5)
        {
            continue
        }
        println(j)
    }

}