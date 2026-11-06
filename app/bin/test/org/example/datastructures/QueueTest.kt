import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.test.Test

class QueueTest{

    @Test
    fun dequeueReturnsFirstItemIn() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        assertEquals(1,queue.dequeue())
        assertEquals(2,queue.dequeue())
        assertEquals(3,queue.dequeue())
        assertTrue(queue.isEmpty())
    }

    @Test
    fun peekReturnsFrontWithoutRemoving(){
        val queue = Queue<String>()
        queue.enqueue("first")
        queue.enqueue("second")
        assertEquals("first", queue.peek())
        assertEquals(2, queue.size())
    }

    @Test
    fun dequeueOnEmptyQueueReturnsNull(){
        assertNull(Queue<Int>().dequeue())
    }

    @Test
    fun peekOnEmptyQueueReturnsNull(){
        assertNull(Queue<Int>().peek())
    }

    @Test
    fun isEmptyIsFalseAfterEnqueue(){
        val queue = Queue<Int>()
        assertTrue(queue.isEmpty())
        queue.enqueue(1)
        assertFalse(queue.isEmpty())
    }
}