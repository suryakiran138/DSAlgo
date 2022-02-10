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
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }else
                    break;
            }
        }
    }
}
