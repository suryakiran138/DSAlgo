package com.patterns.advanced;

public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            // printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
