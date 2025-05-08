package com.study.hashing;

import java.util.Scanner;
/*
count the frequency of the elements. The elements will be from 1 to 50
 */
public class Hashing1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int [] hash = new int[51];
        for(int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        int q = scanner.nextInt();
        for(int i =0; i < q; i++){
            int query = scanner.nextInt();
            int count = hash[query];
            System.out.println(query+"-->"+count);
        }

    }
}
