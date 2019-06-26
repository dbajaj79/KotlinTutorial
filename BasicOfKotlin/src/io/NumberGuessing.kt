package io

import java.util.*

fun main()
{
    val randomNumber = Random().nextInt(100)+1
    var input:String?
    var guess=-1
    while(guess!=randomNumber)
    {
        print("Guess a Number between 1 to 100")
        input = readLine()
        if(input!=null)
        {
            guess =input.toInt()
            if(guess>randomNumber)
            {
                println("Guess is too High")
            }
            else if(guess<randomNumber)
            {
                println("Guess is too Low")
            }
            else if(guess==randomNumber)
            {
                println("You won!")
            }
        }
        println(guess)
    }
}