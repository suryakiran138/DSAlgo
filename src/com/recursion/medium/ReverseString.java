package com.recursion.medium;

public class ReverseString {

    static void printReverse(String str,int n){
        if(n==-1) return;
        System.out.print(str.charAt(n));
        printReverse(str,n-1);
    }

    public static void main(String[] args) {
        String str = "surya";
        printReverse(str, str.length()-1);
    }
}
