import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
       
        // for(int i=0;i<n;i++){
        //     arr[i]= sc.nextInt();
        // }
        int[] arr = {1,2,2,3,1};
        Arrays.sort(arr);
        int j=0;
        arr[j++] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!= arr[i-1]){
                arr[j++] = arr[i];
            }
        }
        int[] result = new int[j];
        for(int i=0;i<j;i++){
            result[i]= arr[i];
        }
        System.out.println(Arrays.toString(result));
        
    }
}
