package com.study.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for(int i =0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for(int i =0; i < n; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], i);
            }else{
                res = Math.max(res, i - mp.get(nums[i]));
            }
        }
        System.out.println("The max distance is : "+res);

    }
}
