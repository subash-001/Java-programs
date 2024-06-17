package com.General;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {4,3,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);

        }

   }
     static int getMaxIndex(int[] arr, int start, int end) {
        int max= start;
        for(int i= start;i<= end;i++){
            if(arr[max]< arr[i]){
                max = i;
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
