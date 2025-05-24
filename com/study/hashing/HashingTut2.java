    package com.study.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    /**
     * Check if the array has duplicate elements are within a distance k from each other
     */
    public class HashingTut2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] arr = new int[n];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i =0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int j =0; j < n; j++) {
            if(! myMap.containsKey(arr[j])){
                myMap.put(arr[j], j);
            }else {
                if(j - myMap.get(arr[j]) <=k){
                    System.out.println("The element is at a distance less than or equal to k");
                    return;
                }else {
                    myMap.put(arr[j], j);
                }
            }

        }
        System.out.println("The element is  at a distance greater than k");

    }
}
