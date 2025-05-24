package com.study.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Minimun number of operations to make all elemets similar
 */
public class HashingTut3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> myMap = new HashMap<>();
        int [] nums = new int[n];
        int maxFreq = 0;
        for(int i =0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        for(int j =0; j < n; j++){
            myMap.put(nums[j], myMap.getOrDefault(nums[j], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: myMap.entrySet()){
            int val = entry.getValue();
            if(val > maxFreq){
                maxFreq = val;
            }
        }
        System.out.println("The number of operations to make all the elements same are : "+(n-maxFreq));

    }
}
