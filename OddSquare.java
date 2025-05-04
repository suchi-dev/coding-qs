import java.util.Scanner;

/*
For N = 4
1357
3571
5713
7135

 */
public class OddSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i < n; i++){
            for(int j = 2* i +1; j <=n*2-1; j+=2){
                System.out.print(j + " ");
            }
            int a = 1;
            for(int k =0; k < i; k++){
                System.out.print(a + " ");
                a+=2;
            }
            System.out.println();

        }
    }
}
