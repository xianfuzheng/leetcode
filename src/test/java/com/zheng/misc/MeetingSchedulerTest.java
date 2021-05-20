package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeetingSchedulerTest {

    MeetingScheduler meetingScheduler = new MeetingScheduler();
    @Test
    public void test() {

        List<Integer> list = meetingScheduler.minAvailableDuration(new int[][]{
                {10, 50}, {60, 120}, {140, 210}
        }, new int[][]{{0, 15}, {60, 70}}, 8);

    }
}