package com.recursion.hard;

public class TilePositions {

    // find number of formations to place tiles of size 1*m in the floor of size n*m
    static int positionCount(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //place horizontally
        int horizontalPlacements = positionCount(n-1,m);
        //place vertically
        int verificalPlacements = positionCount(n-m,m);
        return horizontalPlacements+verificalPlacements;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(positionCount(n,m));
    }
}
