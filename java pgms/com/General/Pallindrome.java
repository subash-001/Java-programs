package com.General;

public class Pallindrome {
    public static void main(String[] args) {
        String a = "madam";
        int left =0, right = a.length()-1;
        boolean isPallindrome = true;
        while (left<right) {
            if(a.charAt(left)!= a.charAt(right)){
                isPallindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPallindrome);
    }
}
