package com.patterns.begineer;

public class FloydTriangle {
    public static void main(String[] args) {
        int m=5;
        int counter = 1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
}
