public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,77};
       minimax(arr);

    }
    public static void minimax(int[] arr){
        int min = arr[0];
        int max= arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("minimum :" + min);
        System.out.println("maximum :" + max);

    }
}
