package com.Strings;

import java.util.*;

public class NonRepeatingCharacter {
    public static char FirstNonRepeatingChar(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()== 1){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        System.out.println("-1");
        return '-';
    }
    public static void main(String[] args) {
        String str = "aababccdd";
        FirstNonRepeatingChar(str);
}
}
