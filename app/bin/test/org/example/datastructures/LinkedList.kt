class LinkedList<T> {
    private class Node<T>(val value: T, var next: Node<T>? = null)

    private var head:Node<T>? = null
    private var count = 0

fun addFirst(value:T){
    head = Node(value,head)
    count++
}

fun addLast(value:T){
    val newNode = Node(value)
    var current = head
    if(current ==null){
        head = newNode
    } else {
        while(current.next !=null){
            current = current.next!!
        }
        current.next = newNode
    }
    count++
}

fun removeFirst():T?{
    val first = head?:return null
    head = first.next
    count --
    return first.value
}

fun contains(value:T):Boolean {
    var current = head
    while(current != null){
        if(current.value ==value) return true
        current = current.next
    }

    return false
}

fun toList():List<T>{
    val result = mutableListOf<T>()
    var current = head
    while(current != null){
        result.add(current.value)
        current = current.next
    }
    return result
}

fun size():Int = count
fun isEmpty():Boolean = count == 0

}