package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class BalanceIndexFinder {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 8, 4, 1, 1, 4, 1, 1, 1, 1, 1, 0, 24);
        int length = list.size();
        int start = 0;
        int last = length - 1;
        int startSum = 0;
        int lastSum = 0;
        int startPrev = -1;
        int lastPrev = length;
        while (start != last) {
            if (startPrev < start) {
                startSum = startSum + list.get(start);
            }
            if (lastPrev > last) {
                lastSum = lastSum + list.get(last);
            }
            if (startSum == lastSum) {
                startPrev = start;
                lastPrev = last;
                start++;
                last--;
            } else if (startSum > lastSum) {
                lastPrev = last;
                startPrev = start;
                last--;
            } else {
                startPrev = start;
                lastPrev = last;
                start++;
            }
        }
        System.out.println(start);
    }
}
