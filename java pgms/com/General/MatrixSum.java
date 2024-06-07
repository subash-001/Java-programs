package com.General;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        int n=3;
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[n][n];
        System.out.println("enter values");
        for(int i= 0;i<n;i++){
            for(int j=0;j<n;j++){
                m1[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=m1[i][j];
            }
        }
        System.out.println("Sum " + sum);
    }
}
