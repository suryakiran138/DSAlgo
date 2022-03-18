package com.sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr,int start,int end){
        int value = arr[end];
        int pivot = start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<value){
                pivot++;
                //swap
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
            }
        }
        pivot++;
        //swap
        int temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
        return pivot;
    }

    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            //System.out.println("start: "+start+" pivot: "+pivot+" end: "+end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
