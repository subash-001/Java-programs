package com.Sorting;

import java.util.Arrays;
// it only valid for elements from 1 to n(which array length)
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,1,2,6};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void Cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i]!= arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }

        }

    }
    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
