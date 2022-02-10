package com.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {23,-9,0,3,1,-10};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int start, int end){
        System.out.println("mergeSort start "+start+" end "+end);
        if(end-start<2)
            return;
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
        //System.out.println("arr: "+Arrays.toString(arr));
    }

    public static void merge(int[] arr,int start,int mid,int end){

        if(arr[mid-1] <= arr[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        if(i<mid && j<end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
        System.out.println("merge start: "+start+" mid: "+mid+" end: "+end+" arr: "+Arrays.toString(arr));
    }
}
