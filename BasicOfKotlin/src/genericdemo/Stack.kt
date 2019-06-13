package genericdemo

class Stack<E>(vararg ags:E)
{
    val elements = ags.toMutableList()

    fun push(element: E)
    {
        elements.add(element)
    }
    fun pop():E?
    {
        if(!isEmpty())
        {
            return elements.removeAt(elements.size-1)
        }
       return null
    }

    fun isEmpty()=elements.isEmpty()
}