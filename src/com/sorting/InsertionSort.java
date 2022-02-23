package com.sorting;

import java.util.Arrays;

import static com.sorting.BubbleSort.swap;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {23,-9,0,3,1,-10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
           int current = arr[i];
           int j= i-1;
           for(;j>=0 && current<arr[j]; j--){
                arr[j+1] = arr[j];
           }
           arr[j+1] = current;
        }
    }
}
