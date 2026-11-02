import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StackTest {

    @Test 
    fun pushAndPopReturnsLastItem() {
        val stack = Stack<Int>()
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.pop())
        assertEquals(1, stack.pop())
        assertTrue(stack.isEmpty())    
    }

    @Test
    fun peekReturnsLastItemWithoutRemoving(){
        val stack = Stack<String>()
        stack.push("first")
        stack.push("second")
        stack.push("third")
        assertEquals("third",stack.peek()) // verifying that the stack is still intack after peek
    }

    @Test
    fun popOnEmptyStackReturnsNull(){
        val stack = Stack<Double>()
        assertEquals(null, stack.pop())
    }
}