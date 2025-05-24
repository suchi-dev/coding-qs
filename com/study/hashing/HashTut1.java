package com.study.hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
Check if there exista a pair in the array such that their sum is equal to target
 */
public class HashTut1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Set<Integer> mySet = new HashSet<>();
        int [] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int j =0; j < n; j++){
            int temp = x - arr[j];
            if(mySet.contains(temp)){
                System.out.println("The element pair exists");
                return;
            }
            mySet.add(arr[j]);
        }
        System.out.println("The element pair doesn't exists");




    }
}
