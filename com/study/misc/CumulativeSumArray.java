package com.study.misc;

import java.util.Scanner;
/*
You are given a list of N numbers and Q queries. Each query is specified by two numbers i and j; the answer to each query is the sum of every number between the range [i, j] (inclusive).
Note: the query ranges are specified using 0-based indexing.
 */
public class CumulativeSumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for(int i =0; i < n; i++){
            nums[i]= scanner.nextInt();
        }
        int q = scanner.nextInt();
        int [] sum = new int[q];
        for(int i =0; i <q; i++){
            int q1 = scanner.nextInt();
            int q2 = scanner.nextInt();
            int temp = 0;
            for(int j=q1; j <=q2; j++){
                temp+=nums[j];
            }
            sum[i] = temp;
        }
        for(Integer s: sum){
            System.out.println("The sum of nos is : "+s);
        }
    }
}
