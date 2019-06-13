package functionsinkotlin

class ReverseTheListDemo
{
    fun reverseOne(list:List<Int>):List<Int>
    {
        var result = ArrayList<Int>()
        for(i in 0..list.size-1)
        {
            val index = list.size-1-i
            result.add(list.get(index))
        }
        return result
    }

    fun reverseTwo(list:List<Int>):List<Int>
    {
        var result = ArrayList<Int>()
        for(i in list.size-1 downTo 0)
        {
            result.add(list.get(i))
        }
        return result
    }
}