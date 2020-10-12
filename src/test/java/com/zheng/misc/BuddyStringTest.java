package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyStringTest {
    BuddyString buddyString = new BuddyString();

    @Test
    public void test() {
        Assertions.assertEquals(false, buddyString.buddyStrings("aa", ""));
        Assertions.assertEquals(true, buddyString.buddyStrings("aa", "aa"));
        Assertions.assertEquals(true, buddyString.buddyStrings("ab", "ba"));
        Assertions.assertEquals(false, buddyString.buddyStrings("ab", "ab"));
        Assertions.assertEquals(true, buddyString.buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }

}