import java.util.Scanner;

/**
 * Pattern to be printed when n = 5
 ..*
 .***
 *****
 .***
 ..*
 */

public class Pattern5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // since the last 2 lines are same, we divide the whole pattern horizontally
        //into 2 parts
        int x = n / 2 + 1;
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x-i; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd part
        for(int i =1; i <= n-x; i++){
            for(int j =1; j <=i; j++){
                System.out.print(".");
            }for(int j=1; j <=n - 2*i; j++){
                    System.out.print("*");
            }
            System.out.println();

        }
    }
}
