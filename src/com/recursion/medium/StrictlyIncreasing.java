package com.recursion.medium;

public class StrictlyIncreasing {

    static void checkStrictlyIncreasing(int[] arr, int n){
        if(n+1==arr.length) {
            System.out.println("Strictly Increasing");
            return;
        }
        if(arr[n]<arr[n+1]){
            checkStrictlyIncreasing(arr,n+1);
        }else {
            System.out.println("not stricting increasing at index: "+n);
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,5,9};

        checkStrictlyIncreasing(arr, 0);
    }


}
