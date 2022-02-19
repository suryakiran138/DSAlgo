package com.patterns.begineer;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                int zeroOrOne = (i+j)%2 == 0 ? 1 : 0;
                System.out.print(zeroOrOne);
            }
            System.out.println();
        }
    }
}
