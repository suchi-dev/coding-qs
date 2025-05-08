package com.study.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Using hashmap storing the frequency of the elements based on user input*/

public class Hashing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
            int g = myMap.getOrDefault(arr[i], 0);
            myMap.put(arr[i], g+1);
        }
        System.out.println("Enter the number of queries:");
        int q = scanner.nextInt();
        for(int j =0; j < q; j++){
            int query = scanner.nextInt();
            int count = myMap.getOrDefault(query, 0);
            System.out.println(query+"--->"+count);
        }

    }
}
