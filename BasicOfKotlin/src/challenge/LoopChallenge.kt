package challenge

fun main() {
    val books = listOf("HandsOn Kotlin","Java Nuts","Head First Java")
    for(book in books)
    {
        if(!book.contains("o"))
        {
            continue
        }
        else
        {
            for(c in book)
            {
                println(c)
            }
        }


    }
}