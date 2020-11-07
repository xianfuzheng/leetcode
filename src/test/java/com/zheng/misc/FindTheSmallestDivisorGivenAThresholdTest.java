package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSmallestDivisorGivenAThresholdTest {
    FindTheSmallestDivisorGivenAThreshold instance = new FindTheSmallestDivisorGivenAThreshold();

    @Test
    public void test() {
        long start = Calendar.getInstance().getTimeInMillis();
        assertEquals(5, instance.smallestDivisor(new int[]{1,2,5,9}, 6));
        assertEquals(3, instance.smallestDivisor(new int[]{2,3,5,7,11}, 11));
        assertEquals(10134, instance.smallestDivisor(new int[]{46480,71852,4544,23598,962,66567,66601,90661,30701,30463,76184,35590,50634,82516,3847,83498,40938,82092,17753,21195,3748,94798,77080,49254,24184,81610,80045,69248,10776,45690,59496,15406,38198,47381,13353,93106,71420,14775,99118,6866,62300,57444,3966,91603,56289,26752,16439,96836,80050,14948,14487,3034,79113,23445,78123,91204,77022,36837,38978,94389,77331,523,42947,25830,55630,45936,76823,32614,49959,5111,74080,59558,79203,93414,11356,87885,50858,4490,11503,35141,4446,52051,75511,41767,64622,61572,28298,21584,77878,99083,47585,75926,84968,12477,86333,55299,99291,47402,82539,19070}, 549));

        System.out.println(Calendar.getInstance().getTimeInMillis() - start);
    }

}