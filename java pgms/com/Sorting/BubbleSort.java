package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,6,7,5,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void Sort(int[] arr){
        Boolean swap;
        for (int i=0;i<arr.length;i++){
           swap= false;
           //for each iteration the max item come at the last respective index
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swap=true;
                }
            }
            // if you didn't swap for a particular value of i, it means that the array is sorted
            //hence break the loop
            if(!swap){
                break;
            }
        }
    }
}
