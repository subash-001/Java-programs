package Recursion;
//Rotated Binary Search

public class RotatedBS {
    public static void main(String[] args) {
       int[] arr ={7,8,9,10,4,2,3};
 
        System.out.println(Search(arr, 2, 0, arr.length-1));

    }
    static int Search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]== target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target >= arr[s] && target<= arr[mid]){
                return Search(arr, target, s, mid-1);
            }else{
                return Search(arr, target, mid+1, e);
            }
    }
        if(target >= arr[mid] && target <= arr[e] ){
            return Search(arr, target, mid+1, e);
        }
        return Search(arr, target, s, mid-1);
}
}