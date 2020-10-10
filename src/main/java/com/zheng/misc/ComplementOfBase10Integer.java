package com.zheng.misc;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int N) {

        int[] arr = new int[32];

        for(int i=0;i<32; i++) {
            if( ((N>>i) & 1) == 1) {
                arr[i] = 1;
            }
        }

        int end = 0;
        for(int i=0;i<32; i++) {
           if(arr[i] == 1) {
               end = i;
           }
        }
        for(int i=end;i>=0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(Integer.toBinaryString(N));

        int result = 0;
        for(int i=0;i<=end; i++) {
            if(arr[i] == 0) {
                result +=  (1 << i);
            }
        }

        return result;

    }
}
