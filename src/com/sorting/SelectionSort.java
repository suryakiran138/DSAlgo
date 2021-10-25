package com.sorting;

import java.util.Arrays;

import static com.sorting.BubbleSort.swap;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {23,-9,0,3,1,-10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {

        for(int i=arr.length-1;i>0;i--){
            int max_index = i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[max_index]){
                    max_index = j;
                }
            }
            swap(arr,i, max_index);
        }
    }
}
