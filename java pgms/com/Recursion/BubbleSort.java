package com.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
       Sort(arr, arr.length-1);
       System.out.println(Arrays.toString(arr));
        
    }
    static void Sort(int[] arr, int n){
        
        if(n==0){
            return ;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }
        Sort(arr, n-1);
               

    }
}
