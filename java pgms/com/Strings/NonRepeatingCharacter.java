package com.Strings;

import java.util.*;

// public class NonRepeatingCharacter {
//     public static char FirstNonRepeatingChar(String str){
//         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//         for(char ch : str.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         for(Map.Entry<Character, Integer> entry : map.entrySet()){
//             if(entry.getValue()== 1){
//                 System.out.println(entry.getKey());
//                 return entry.getKey();
//             }
//         }
//         System.out.println("-1");
//         return '-';
//     }
//     public static void main(String[] args) {
//         String str = "aababccdd";
//         FirstNonRepeatingChar(str);
// }
// }
public class NonRepeatingCharacter {
    public static int FirstNonRepeatingChar(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
       for(int i=0;i<str.length();i++){
        if(freq[str.charAt(i)- 'a']==1){
            return i;
        }
       }
        return -1;
    }
    public static void main(String[] args) {
        String str= "aabacc";
        System.out.println(FirstNonRepeatingChar(str));
    }
    
}