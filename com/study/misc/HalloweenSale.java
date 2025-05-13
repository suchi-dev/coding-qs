package com.study.misc;

import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int budget = scanner.nextInt();
        int count = 0;
        int cost = p;
        while(budget >=cost){
            budget-=cost;
            count++;
            cost = Math.max(cost - d, m);
        }

        System.out.println("The number of games purchased : "+count);

    }
}
