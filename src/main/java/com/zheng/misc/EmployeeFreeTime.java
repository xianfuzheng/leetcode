package com.zheng.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeFreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {

        List<Interval> allIntervals = new ArrayList<Interval>();

        for(List<Interval> list: schedule) {
            allIntervals.addAll(list);
        }

        Collections.sort(allIntervals, Comparator.comparingInt(a -> a.start));

        int start = allIntervals.get(0).start;
        int end = allIntervals.get(0).end;

        List<Interval> mergedIntervalList = new ArrayList<Interval>();

        for(int i=1; i<allIntervals.size(); i++) {

            int newStart = allIntervals.get(i).start;
            int newEnd = allIntervals.get(i).end;

            if (end >= newStart) {
                end = Math.max(end, newEnd);
            } else {
                mergedIntervalList.add(new Interval(start, end));

                start = newStart;
                end = newEnd;
            }
        }
        mergedIntervalList.add(new Interval(start, end));

        List<Interval> result = new ArrayList<Interval>();

        for(int i=1; i< mergedIntervalList.size(); i++) {
            result.add(new Interval(mergedIntervalList.get(i-1).end , mergedIntervalList.get(i).start));
        }

        return result;
    }
}

class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};