package chapter4

fun main() {

    val stringarray = getArray()
    printArray(stringarray)
}
fun getArray(): Array<String?>
{
    val values = arrayOfNulls<String>(5)
    values.set(0,"Deepak")
    values.set(1,"Pardeep")
    values.set(2,"Sandeep")
    values.set(3,"Kuldeep")
    values.set(4,"Hardeep")
    return values
}
fun printArray(args:Array<String?>)
{
    for(i in args)
    {
        val index = args.indexOf(i)
        println(args.get(index))

    }
}