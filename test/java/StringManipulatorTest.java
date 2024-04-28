import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import StringManipulator.StringManipulator;

public class StringManipulatorTest {

    @Test
    void testConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    void testFindLength() {
        StringManipulator manipulator = new StringManipulator();
        int length = manipulator.findLength("Hello");
        assertEquals(5, length);
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.convertToUpperCase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.convertToLowerCase("HELLO");
        assertEquals("hello", result);
    }

    @Test
    void testContainsSubstring() {
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.containsSubstring("Hello World", "World");
        assertTrue(result);
    }
}
