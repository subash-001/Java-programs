package com.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        Sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Sort(int[] arr, int i, int j){
        if(j==0){
            return ;
        }

        if(i<j){
            if(arr[i]> arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
            Sort(arr, i+1, j);
        }
        else{
            Sort(arr, i, j-1);
        }
        

    }
}
