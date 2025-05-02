public class Transpose {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] arr2 = new int[rows][cols];
        for(int i =0; i < rows; i++){
            for(int j =0; j < cols; j++){
                arr2[i][j] = arr[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
    }
}
