public class LeftDiagonal {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int leftSum = 0;
        int rightSum = 0;
        for(int i =0; i < rows; i++){
            for(int j=0; j < cols; j++){
                //(0.0) (1,1) (2,2)
                if(i==j){
                    leftSum+= arr[i][j];
                }
                //(0,2), (1,1) (2,0)
                if(i + j == arr.length-1){
                    rightSum+=arr[i][j];
                }
            }
        }
        System.out.println("The left diagonal sum is : "+leftSum);
        System.out.println("The right diagonal sum is : "+rightSum);

    }


}
