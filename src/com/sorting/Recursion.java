package com.sorting;

public class Recursion {

    public static void main(String[] args) throws Exception {

        System.out.println(factorialRecursive(4));
        System.out.println(factorialIterative(4));

    }

    public static int factorialIterative(int n) {
        int factorial = 1;
        for(int i=n; i>0; i--){
            //System.out.println("i: "+i+" factorial : "+factorial);
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRecursive(int n) throws Exception {
        if(n<0)
            throw new Exception("no factorial for negative numbers");
        else if(n==0)
            return 1;
        else
            return n * factorialRecursive(n-1);
    }
}
