package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverseStringReturnsNull() {
        assertNull(StringUtils.reverseString(null));
    }

    @Test
    void testReverseStringReturnsEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseStringSimpleString() {
        assertEquals("ih", StringUtils.reverseString("hi"));
    }

}
