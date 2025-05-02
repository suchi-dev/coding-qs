public class ZPattern {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4}, {5,6,7,8}, {4,5,6,7}, {6,7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        // 1st row except the last row as it covered as a part of the right diagonal
        int i =0;
        for(int j =0; j < cols-1; j++){
            System.out.print(arr[i][j] + " ");
        }
        // right diagonal elements except the last row
        for(int m =0; m < rows -1; m++){
            for(int n = 0; n < cols; n++){
                if(m + n == rows -1){
                    System.out.print(arr[m][n]+ " ");
                }
            }
        }

        // last row elements
        i = rows -1;
        for(int j =0; j < cols ; j++){
            System.out.print(arr[i][j]+ " ");
        }

    }
}
