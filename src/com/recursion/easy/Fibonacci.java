package com.recursion.easy;

public class Fibonacci {

    static int fibonacci(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibonacci(n-1) +fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }
}
