package com.study.hashing;

import java.util.HashMap;
import java.util.Map;
/*
Find if arr2 is a subset of arr1
 */
public class HashingTut5 {
    public static void main(String[] args) {
        int [] arr1 = {6,7,3,2,2};
        int [] arr2= {6,7,2,3,3};

        boolean isSubset = findSubset(arr1, arr2);
        System.out.println("The arr 2 is as subset of arr1 ? : "+isSubset);
    }

    private static boolean findSubset(int[] arr1, int[] arr2) {
        if(arr1.length < arr2.length) return false;

        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i =0; i < arr1.length; i++){
            myMap.put(arr1[i], myMap.getOrDefault(arr1[i], 0)+1);

        }
        for(Integer num : arr2){
            if(! myMap.containsKey(num)) return false;

            if(myMap.get(num) == 0) return false;

            int count = myMap.get(num);
            myMap.put(num, count - 1);
        }

        return true;


    }
}
