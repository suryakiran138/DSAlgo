package com.patterns.advanced;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        // printing triangle
        for(int i=1;i<=n;i++){
            //printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // printing reverse triangle
        for(int i=n;i>=1;i--){
            //printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
