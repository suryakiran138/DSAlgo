package com.sorting;

import java.util.Arrays;

import static com.sorting.BubbleSort.swap;

/*
* shell sort optimises insertion sort
*
* */
public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {23,-9,0,3,1,-10};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shellSort(int[] arr) {
        for(int gap=arr.length/2; gap>0; gap /= 2) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = i - gap; j >= gap; j-=gap) {
                    if (arr[i] >= arr[j])
                        break;
                    else
                        swap(arr, i, j);
                }
            }
        }
    }
}
