package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    SimplifyPath simplifyPath = new SimplifyPath();

    @Test
    public void test(){
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
        assertEquals("/", simplifyPath.simplifyPath("/../"));
        assertEquals("/c", simplifyPath.simplifyPath("/a/./b/../../c/"));
        assertEquals("/c", simplifyPath.simplifyPath("/a/../../b/../c//.//"));
    }

}