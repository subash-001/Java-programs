package com.Recursion;
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,3,3,33,99,89};
        int index=0;
       System.out.println(sorted(arr,  index)); 
    }
    static Boolean sorted(int[] arr, int index){
        if(index== arr.length-1) {
            return true;
        }
        return (arr[index]<= arr[index+1]) && sorted(arr, index+1);

    }
}
