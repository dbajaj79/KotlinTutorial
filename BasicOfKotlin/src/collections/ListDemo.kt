package collections

fun main() {
    val listDemo =  arrayListOf("Good","Bad","Deepak","Aayu","Pankaj","Navdeep","Hardeep","Sandeep","Sachin")

    val immutableList = listOf("Create","Delete","Update","Read")
    println("ImmutableList Demo")
    println("Get Method")
    println(immutableList.get(0))
    println("Get Element using Subscript Operator")
    println(immutableList[1])
    println("Get The Size of ImmutableList")
    println(immutableList.size)
    println("Contains in ArrayList")
    immutableList.contains("Delete")

    println("Mutable List")
    println("Add all Methods")
    listDemo.addAll(immutableList)
    println(listDemo)
    println("Add Method")
    listDemo.add("Great")
    println(listDemo)
    println("Remove")
    listDemo.remove("Great")
    println(listDemo)
    println("Remove All")
    listDemo.removeAll(immutableList)
    println(listDemo)
    println("SubList")
    val subList = listDemo.subList(2,5)
    println(subList)

    println("Replace or Change Element")
    subList.set(0,"Chander")
    println(subList)

}