package com.Recursion;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {

        int[] arr ={4,6,2,8,6,9};
        Selection(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void Selection(int[] arr, int n){
        if(n==1) return;
        
        int maxIndex= getMaxindex( arr, 0, n-1);

        swap(arr, maxIndex, n-1);
        Selection(arr, n-1);

    }
    static int getMaxindex(int[] arr, int start, int end){
        int max = start;
       for(int i= start;i<= end;i++){
        if(arr[i]> arr[max]){
            max= i;
        }
       }
       return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }


}
