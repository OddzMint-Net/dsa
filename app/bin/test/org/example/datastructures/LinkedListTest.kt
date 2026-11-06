import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.test.Test

class LinkedListTest{

    @Test
    fun addLastKeepsInsertionOrder(){
        val list = LinkedList<Int>()
        list.addLast(1)
        list.addLast(2)
        list.addLast(3)
        assertEquals(listOf(1,2,3), list.toList())
    }

    @Test
    fun addFirstPutsItemAtFront(){
        val list = LinkedList<Int>()
        list.addLast(2)
        list.addFirst(1)
        assertEquals(listOf(1,2), list.toList())
    }

    @Test
    fun removeFirstReturnsFrontItem(){
        val list = LinkedList<String>()
        list.addLast("a")
        list.addLast("b")
        assertEquals("a", list.removeFirst())
        assertEquals(listOf("b"), list.toList())
        assertEquals(1,list.size())
    }

    @Test
    fun removeFirstOnEmptyListReturnsNull(){
        assertNull(LinkedList<Int>().removeFirst())
    }

    @Test
    fun containsFindsExistingAndMissingValues(){
        val list = LinkedList<Int>()
        list.addLast(5)
        list.addLast(10)
        assertTrue(list.contains(5))
        assertFalse(list.contains(15))
    }

    @Test
    fun isEmptyIsTrueOnlyForEmptyList(){
        val list = LinkedList<Int>()
        assertTrue(list.isEmpty())
        list.addFirst(1)
        assertFalse(list.isEmpty())
    }
}