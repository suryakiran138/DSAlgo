package com.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void divide(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end){
        int length = end-start+1;
        int[] merged = new int[length];
        int p1 = start;
        int p2 = mid+1;
        for(int i=0;i<length;i++){
            if(p1>mid){
                merged[i] = arr[p2];
                p2++;
            }else if(p2>end){
                merged[i] = arr[p1];
                p1++;
            }else if(arr[p1]<=arr[p2]){
                merged[i] = arr[p1];
                p1++;
            }else{
                merged[i] = arr[p2];
                p2++;
            }
        }
        for(int i=0;i<length;i++){
            arr[start+i] = merged[i];
        }
    }
}
