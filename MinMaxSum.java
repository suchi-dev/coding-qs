import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        int maxSum=0;
        int minSum=0;
        List<Integer> arr = Arrays.asList(7,69, 2, 221, 8974);
        List<Integer> sortedList = arr.stream().sorted().toList();
        int sum =0;
        for(int i =0; i <  arr.size(); i++){
            sum+=arr.get(i);
        }
        minSum = sum -sortedList.get(arr.size()-1);
        maxSum = sum - sortedList.get(0);

        System.out.print(minSum + " "+maxSum);

    }
}
