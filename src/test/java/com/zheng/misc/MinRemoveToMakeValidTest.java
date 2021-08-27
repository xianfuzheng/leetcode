package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRemoveToMakeValidTest {
    MinRemoveToMakeValid minRemoveToMakeValid = new MinRemoveToMakeValid();
    @Test
    public void test() {
        assertEquals("lee(t(c)o)de", minRemoveToMakeValid.minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("ab(c)d", minRemoveToMakeValid.minRemoveToMakeValid("a)b(c)d"));
        assertEquals("", minRemoveToMakeValid.minRemoveToMakeValid("))(("));
    }

}