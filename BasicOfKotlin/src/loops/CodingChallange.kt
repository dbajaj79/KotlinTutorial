package loops

fun main() {
    var sum=0;
    for(i in 100..10000)
    {
        sum+=i
    }

    println(sum)
}