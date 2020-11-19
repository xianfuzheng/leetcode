package com.zheng.misc;

public class ConvertANumberToHexadecimal {
    private char toChar(int digit) {
        return digit < 10
                ? (char)('0' + digit)
                : (char)('a' + digit - 10);
    }

    public String toHex(int num) {

        if ( num == 0) {
            return "0";
        }

        int[] digits = new int[8];

        int n = num>0? num : -1*num -1;

        int pos = 0;
        while(n>0) {
            digits[pos ++] = n%16;
            n = n/16;
        }

        StringBuffer sb = new StringBuffer();

        if(num>0) {
            for(int i=0;i<8;i++) {
                int k = digits[i];
                sb.append(toChar(k));
            }

        } else {
            for(int i=0;i<8;i++) {
                int k = digits[i];
                sb.append(toChar(15 - k));
            }
        }

        String result = sb.reverse().toString();
        int i=0;
        for(; i<result.length(); i++) {
            if(result.charAt(i) != '0') {
                break;
            }
        }
        return result.substring(i);
    }
}
