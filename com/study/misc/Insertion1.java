package com.study.misc;

import java.util.Arrays;
import java.util.List;

public class Insertion1 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 1, 4, 7, 5, 6);
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                    j--;
                } else {
                    break;
                }
            }
            for (Integer k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
