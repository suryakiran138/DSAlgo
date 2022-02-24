package com.recursion.hard;

import java.util.ArrayList;

public class SubSets {

    static void printSubSet(ArrayList<Integer> subset){
        for(int n:subset){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    // print all subsets of first n natural numbers
    static void printSubSets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubSet(subset);
            return;
        }
        //element is added
        subset.add(n);
        printSubSets(n-1,subset);
        //element is not added
        subset.remove(subset.size()-1); // bcz n is added above
        printSubSets(n-1,subset);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        printSubSets(n,subset);
    }
}
