import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int [] arr= {2,3,5,2,3,6,7,8,2,1};
        int n = arr.length;
        // Initialize visited boolean array as false as no elements have been visited so far
        boolean [] visited = new boolean[n];
        Arrays.fill(visited, false);

        for(int i =0; i < n; i++){
            // if the element appears for the 1st time.
            if(! visited[i]){
                int count = 1;
                visited[i] = true;
                // we check the remaining elements from i+1
                for(int j=i+1; j< n; j++){
                    if(arr[i] == arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i]+"->"+count);
            }
        }


    }
}
