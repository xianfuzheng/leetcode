package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFreeTimeTest {

    EmployeeFreeTime employeeFreeTime = new EmployeeFreeTime();

    @Test
    public void test() {

        List<List<Interval>> schedule = new ArrayList<>();

        List<Interval> list = new ArrayList<>();

        list.add(new Interval(1, 3));
        list.add(new Interval(6, 7));
        schedule.add(list);

        list = new ArrayList<>();
        list.add(new Interval(2, 4));
        schedule.add(list);

        list = new ArrayList<>();
        list.add(new Interval(2, 5));
        list.add(new Interval(9, 12));
        schedule.add(list);

        employeeFreeTime.employeeFreeTime(schedule);
    }
}