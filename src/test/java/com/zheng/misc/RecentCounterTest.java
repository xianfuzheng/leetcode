package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RecentCounterTest {
    RecentCounter instance = new RecentCounter();

    @Test
    public void test() {
        Assertions.assertEquals(1,instance.ping(1));
        Assertions.assertEquals(2,instance.ping(100));
        Assertions.assertEquals(3,instance.ping(3001));
        Assertions.assertEquals(3,instance.ping(3002));
    }

}