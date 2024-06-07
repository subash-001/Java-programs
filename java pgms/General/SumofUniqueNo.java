package General;
import java.util.Arrays;

public class SumofUniqueNo {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,177,1};
        Arrays.sort(arr);
        int count=arr[0];
        int current = arr[0];
        for (int i=1;i<arr.length;i++){
            if (current!=arr[i] ){
                count+=arr[i];
                current=arr[i];

            }
           
        }
        System.out.println(count);

    }
}
