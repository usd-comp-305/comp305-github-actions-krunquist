package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reversesSimpleWord() {
        assertEquals("cba", StringUtils.reverseString("abc"));
    }

}