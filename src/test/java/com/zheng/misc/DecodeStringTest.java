package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    DecodeString decodeString = new DecodeString();

    @Test
    public void test() {
        assertEquals("abababababababababab", decodeString.decodeString("10[ab]"));
        assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
        assertEquals("abccdcdcdxyz", decodeString.decodeString("abc3[cd]xyz"));
    }

}