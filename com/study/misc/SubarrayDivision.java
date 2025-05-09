package com.study.misc;
/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

*/

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2,2,1,3,2);
        int d = 4;
        int m = 2;
        int count = 0;
        for(int i =0; i < s.size(); i++){
            int sum = 0;
            int lengthCount = 0;
            for(int j =i; j < j+m;j++){
                if(j >=s.size() || sum >=d ){
                    break;
                }
                sum+=s.get(j);
                lengthCount++;

            }
            if(sum == d && lengthCount==m){
                count++;
            }
        }
        System.out.println("The count is : "+count);


    }
}
