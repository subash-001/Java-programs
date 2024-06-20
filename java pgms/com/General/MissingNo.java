package com.General;

import java.util.Arrays;
//Kind of cyclic sort problem
class MissingNo {
    public static int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i];//In this case array starts from 0 to n hence -1 is excluded
            // The elements are in the correct position .. i.e., arr[0] = 0
            if(nums[i]< nums.length  && nums[i] != nums[correctIndex] ){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int index= 0;index<nums.length;index++){
            if(nums[index]!= index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
    public static void main(String[] args) {
        int[] nums= {3,0,1};
        
        System.out.println(missingNumber(nums));
        System.out.println(Arrays.toString(nums));
    }
}