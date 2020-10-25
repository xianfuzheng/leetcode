package com.zheng.misc;

import java.util.Arrays;

public class BagOfTokens {

    public int bagOfTokensScore(int[] tokens, int P) {
        if(tokens.length ==0) {
            return 0;
        }
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);
        int l =0;
        int r = tokens.length -1;

        while(l<=r) {
            int tokenL = tokens[l];
            int tokenR = tokens[r];
            if( tokenL <= P ) {
                P = P - tokenL;
                score ++;
                l ++;
                maxScore = Math.max(score, maxScore);
            } else {
                if(score <= 0) {
                    break;
                }
                P = P + tokenR;
                score --;
                r--;
            }
        }

        return maxScore;
    }
}
