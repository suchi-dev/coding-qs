public class ReverseMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] arr2 = new int[rows][cols];
        for(int i =0; i < rows; i++){
            for(int j=cols-1,k =0; j >=0; j--, k++){
                arr2[i][k] = arr[i][j];
                System.out.print(arr2[i][k]+ " ");
            }
            System.out.println();
        }
    }
}
