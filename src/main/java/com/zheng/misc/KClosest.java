package com.zheng.misc;

import java.util.PriorityQueue;

public class KClosest {

    public int[][] kClosest2(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>( (b,a )-> (a[0]*a[0] + a[1]* a[1]) - (b[0]*b[0] + b[1]*b[1]));
        for(int i=0; i<points.length; i++) {
            pq.offer(points[i]);
            if(pq.size()>k) {
                pq.poll();
            }
        }

        int[][] sol = new int[k][2];
        int i=0;
        while (pq.size() > 0) {
            sol[i++] = pq.poll();
        }

        return sol;
    }

    public int[][] kClosest(int[][] points, int k) {
        solve(points, 0, points.length-1, k);

        int[][] results = new int[k][2];
        for(int i=0; i<k; i++) {
            results[i][0] = points[i][0];
            results[i][1] = points[i][1];
        }
        return results;
    }

    private void solve(int[][] points, int start, int end, int k) {

        int mid = start + (end - start) /2;
        System.out.println(start + " " + end +"  " + mid);

        int dist = getDistance(points, mid);

        int left = start;
        int right = end;

        while (left <= right) {
            while(left<=right) {
                int leftDistance = getDistance(points, left);
                if(leftDistance >= dist) {
                    break;
                }
                left ++;
            }

            while(left<=right) {
                int rightDistance = getDistance(points, right);
                if(rightDistance <= dist) {
                    break;
                }
                right --;
            }

            if(left <= right) {
                swap(points, left, right);
                left ++;
                right --;
            }
        }

        System.out.println(left + " " + right +"  " + k);

        if (k <= right){
            solve(points, start, right, k);
        }
        if (k > left){
            solve(points, left, end, k);
        }
    }

    public void swap(int[][] points, int left, int right){
        int[] tempLeft = {points[left][0], points[left][1]};
        points[left][0] = points[right][0];
        points[left][1] = points[right][1];
        points[right][0] = tempLeft[0];
        points[right][1] = tempLeft[1];
    }

    private int getDistance(int [][] points, int index) {
        return points[index][0] * points[index][0] + points[index][1] * points[index][1];
    }
}
