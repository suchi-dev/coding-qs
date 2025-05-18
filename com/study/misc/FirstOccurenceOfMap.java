package com.study.misc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstOccurenceOfMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char [] ch = s.toCharArray();
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for(int i =0; i < ch.length; i++){
            mp.put(ch[i], mp.getOrDefault(ch[i], 0)+1);
        }
        System.out.println("Printing the map");
        for(Map.Entry<Character, Integer> e: mp.entrySet()){
            System.out.println(e);
        }

        int index = -1;
        for(Character k : mp.keySet()){
            int v = mp.get(k);
            if(v == 1){
                 index = s.indexOf(k);
                break;
            }
        }
        System.out.println("The index of the unique element is : "+index);

    }
}
