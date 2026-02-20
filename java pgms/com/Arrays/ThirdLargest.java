import java.util.Arrays;

public class ThirdLargest {
    static void thirdlargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]> second && arr[i]< first){
                third = second;
                second = arr[i];
            }
            else if (arr[i]>third && arr[i]< second){
                third = arr[i];
            }
        }
        System.out.println(third);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,5,6,7,9};
        Arrays.sort(arr);
        thirdlargest(arr);
    }
}
