package kotlinexamples.lopping

fun main()
{
    println("Enter a Number")
    var a = readLine();
    var factiorial:Long =1
    val number = a!!.toInt()
    for(i in 1..number)
    {
        factiorial*=i;
    }
    println("Factorial of Given Number is=$factiorial")

}
