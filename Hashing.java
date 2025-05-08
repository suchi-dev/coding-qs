import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for(int i =0; i < q; i++){
            int query = scanner.nextInt();
            int count = 0;
            for(int k =0; k < arr.length; k++){
                if(arr[k] == query){
                    count++;
                }
            }
            System.out.println("The number : "+query+ " occurred "+count+" times");
        }
    }
}
