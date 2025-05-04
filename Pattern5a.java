import java.util.Scanner;

/*
Pattern to be printed when n =4
***1
**232
*34543
4567654
 */
public class Pattern5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0; i < n; i++){
            for(int j=0; j < n-1-i; j++){
                System.out.print("*");
            }
            for(int j =i+1; j<=2*i+1; j++){
                System.out.print(j+" ");
            }
            for(int j = 2 * i ; j >=i+1; j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
