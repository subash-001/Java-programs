package com.Recursion;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        // int n1=0, n2=1;
        // int n3;
        // Scanner sc =new Scanner(System.in);
        // int n =sc.nextInt();
        // System.out.print(n1 + " " +n2);
        // for(int i=2;i<n;i++){
        //     n3= n1+n2;
        //     System.out.print(" "+n3);
        //     n1=n2;
        //     n2=n3;
           
        // }

         System.out.println(fibo(10));
    }
    
    static int fibo(int n){
        if (n<2) {
            return n;
            
        }
        return fibo(n-1) + fibo(n-2);
    }
}
