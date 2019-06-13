package DataClass

class Book(val title:String,val author:String,val publicatonYear:Int,var price:Double)
{

}
data class DataBook(val title:String,val author:String,val publicatonYear:Int,var price:Double)
{

}

fun main() {
    val book = Book("Super Book","John Doe",2019,99.99)
    val book1= Book("Super Book","John Doe",2019,99.99)
    val dataBook = DataBook("Super Book","John Doe",2019,99.99)
    val dataBook1 = DataBook("Super Book","John Doe",2019,99.99)
    val dataBook2 = dataBook.copy()
    val dataBook3 = dataBook.copy(price = 100.0)
    val dataBookSet = hashSetOf(dataBook,dataBook1,dataBook2,dataBook3)
    val bookSet = hashSetOf(book,book1)


    println(book)
    println(dataBook)
    println(dataBook.equals(dataBook1))
    println(dataBook2)
    println(book.equals(book1))
    println(dataBook3)
    val(name,auther,price,year)=dataBook
    println(name)
    println(auther)
    println(price)
    println(year)
    println(dataBookSet)
    println(bookSet)
    println()

}