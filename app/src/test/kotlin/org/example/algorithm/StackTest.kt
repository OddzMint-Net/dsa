import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StackTest {
    @Test 
    fun pushAndPopReturnsLastItem(){
        val stack = Stack<Int>()
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.pop())
        assertEquals(1, stack.pop())
        assertTrue(stack.isEmpty())    
    }
}