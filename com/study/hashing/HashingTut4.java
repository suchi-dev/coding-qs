package com.study.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Find the freq of each element of the array
 *
 */
public class HashingTut4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        Map<Integer, Integer> myMap = new HashMap<>();
        int q = scanner.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0) + 1);
        }
        int [] queries = new int[q];
        for(int i =0; i < q; i++){
            queries[i] = scanner.nextInt();
        }
        for(int i =0; i < q; i++){
            System.out.println("The number : "+ queries[i] + " occurs : "+myMap.getOrDefault(queries[i], 0) + " times");
        }



    }
}
