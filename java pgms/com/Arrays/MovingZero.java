import java.lang.reflect.Array;
import java.util.Arrays;

public class MovingZero {
    public static void main(String[] args) {
        int[] arr = {1,2,0,6,0,4,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
