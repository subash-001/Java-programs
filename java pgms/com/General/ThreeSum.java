package com.General;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2,4,67,6,3};
        Arrays.sort(arr);
        System.out.println(findNum(arr,124 ));        
    }

    static  boolean findNum(int[] arr, int x){
        for(int i=0; i< arr.length-2;i++){
            int left= 0;
            int right= arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == x){
                    return true;
                }
                else if(sum<x){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return false;
    }
}
