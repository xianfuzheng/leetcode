package com.zheng.misc;

import java.util.ArrayList;
import java.util.List;

public class CountOrders {

    long mod = (long)Math.pow(10, 9) + 7;
    public int countOrders(int n) {
        long count = 1;

        for (int i=2; i<=n; i++) {
            int currentNumber = (i-1) *2;

            int nOfP = currentNumber +1;
            int sum = 0;
            for(int j=0; j<nOfP; j++) {
                sum += (nOfP - j);
            }

            count = (count * sum )%mod;
        }
        return (int) count;
    }


    long count = 0;

    public int countOrders2(int n) {
        List<Integer> unPickedOrders = new ArrayList<>();
        for(int i=0; i<n; i++) {
            unPickedOrders.add(i);
        }

        List<Integer> pickedOrders = new ArrayList<>();
        List<Integer> deliveredOrders = new ArrayList<>();

        solve(unPickedOrders, pickedOrders, deliveredOrders, n, new ArrayList<String>());

        return (int)count;
    }

    private void solve(List<Integer> unPickedOrders, List<Integer> pickedOrders, List<Integer> deliveredOrders, int total, List<String> msgList) {
        //System.out.println(pickedOrders);
        //System.out.println(deliveredOrders);
        if (deliveredOrders.size() == total) {
            count ++;
            System.out.println(msgList);
            return;
        }


        for(int i=0; i<unPickedOrders.size(); i++) {
            int pickedId = unPickedOrders.get(i);

            pickedOrders.add(pickedId);
            List<Integer> list = new ArrayList<>(unPickedOrders);
            list.remove(Integer.valueOf(pickedId));

            msgList.add("P" + pickedId);
            solve(list, pickedOrders, deliveredOrders, total, msgList);
            pickedOrders.remove(pickedOrders.size() -1);
            msgList.remove(msgList.size()-1);
        }

        for (int i=0; i<pickedOrders.size(); i++) {
            int pickedId = pickedOrders.get(i);

            deliveredOrders.add(pickedId);

            List<Integer> list = new ArrayList<>(pickedOrders);
            list.remove(Integer.valueOf(pickedId));
            msgList.add("D" + pickedId);

            solve(unPickedOrders, list, deliveredOrders, total, msgList);
            deliveredOrders.remove(deliveredOrders.size() -1);
            msgList.remove(msgList.size()-1);
        }

    }
}
