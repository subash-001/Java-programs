package com.General;
public class StringRev {

    public static void main(String[] args) {
    //     String a="Subash";
       
    //     String reversed= StringReverse(a);
    //     System.out.println(reversed);
       
    // }

    // public static String StringReverse(String a){
    //     String b="";
    //     for(int i = a.length()-1;i>=0;i--){
             
    //         b+=a.charAt(i);
    //     }

    //     return b;



    String a="Subash";
    StringBuilder sb= new StringBuilder();
    String b = sb.append(a).reverse().toString();
    System.out.println(b);

    }
}