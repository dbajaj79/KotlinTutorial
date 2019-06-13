package genericdemo

fun <E>stackOf(vararg args:E):Stack<E>
{
    return Stack(*args)
}