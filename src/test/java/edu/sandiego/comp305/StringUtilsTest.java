package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reversesSimpleWord() {
        assertEquals("cba",
                StringUtils.reverseString("abc"));
    }

    @Test
    void reversesEmptyString() {
        assertEquals("",
                StringUtils.reverseString(""));
    }

    @Test
    void singleCharacterIsUnchanged() {
        assertEquals("a",
                StringUtils.reverseString("a"));
    }

    @Test
    void palindromeStaysTheSame() {
        assertEquals("racecar",
                StringUtils.reverseString("racecar"));
    }

    @Test
    void reversesSpacesAndPunctuation() {
        assertEquals("!dlrow ,olleH",
                StringUtils.reverseString("Hello, world!"));
    }

    @Test
    void nullInputReturnsNull() {
        assertNull(StringUtils.reverseString(null));
    }
}
