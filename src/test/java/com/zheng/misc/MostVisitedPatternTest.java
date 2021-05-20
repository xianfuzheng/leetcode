package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MostVisitedPatternTest {
    MostVisitedPattern mostVisitedPattern = new MostVisitedPattern();

    @Test
    public void test() {

        List<String> result = mostVisitedPattern.mostVisitedPattern(new String[]{"joe", "joe", "joe", "james", "james", "james", "james", "mary", "mary", "mary"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new String[]{"home", "about", "career", "home", "cart", "maps", "home", "home", "about", "career"});

        System.out.println(result);
    }
}