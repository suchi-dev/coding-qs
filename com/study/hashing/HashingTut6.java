package com.study.hashing;

import java.util.HashSet;
import java.util.Set;

/*
Check if arr2 is a subset of arr1
Here arr1 and arr2 do not have duplicates
 */
public class HashingTut6 {
    public static void main(String[] args) {
        int [] arr1 = {6,7,3,2};
        int [] arr2 = {2,1};
        boolean isSubset = findSubset(arr1, arr2);
        System.out.println("The arr2 is a subset of arr1 ? : "+ isSubset);


    }

    private static boolean findSubset(int[] arr1, int[] arr2) {
        Set<Integer> mySet = new HashSet<>();
        for(Integer i : arr1){
            mySet.add(i);
        }
        for(Integer n : arr2){
            if(!mySet.contains(n)){
                return false;
            }
        }

        return  true;
    }

}
