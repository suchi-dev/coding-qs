import java.util.Scanner;

/* pattern to be printed  when n is 3 is :
  **1
  *12
  123
  */
public class Patterns4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j <=n -i-1; j++){
                System.out.print("*");
            }
            for(int k =1; k<=i+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
