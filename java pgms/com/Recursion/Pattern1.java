package com.Recursion;
//Pattern
public class Pattern1 {
    public static void main(String[] args) {
        Triangle(4, 0);
        Triangle1(4, 0);
        
    }
    static void Triangle(int row, int column){
        if(row==0){
            return ;
        }
        if(column<row){
            System.out.print("*");
            Triangle(row, column+1);
        }
        else{
            System.out.println();
            Triangle(row-1, 0);
        }
    }

    static void Triangle1(int row, int column){
        if(row==0){
            return ;
        }
        if(column<row){
            Triangle1(row, column+1);
            System.out.print("*");
        }
        else{
           
            Triangle1(row-1, 0);
            System.out.println();
        }
    }

}
