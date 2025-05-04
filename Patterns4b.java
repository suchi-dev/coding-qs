import java.util.Scanner;

/*
Pattern to be printed when n is 4
4 4 4 4
3 3 3
2 2
1
 */
public class Patterns4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
