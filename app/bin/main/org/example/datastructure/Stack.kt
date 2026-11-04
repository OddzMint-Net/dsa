
class Stack<T>{
    private val items = mutableListOf<T>()

    fun push(item:T) { items.add(item)}
    fun pop():T? = items.removeLastOrNull()
    fun peek():T? = items.lastOrNull()
    fun isEmpty():Boolean = items.isEmpty()
}