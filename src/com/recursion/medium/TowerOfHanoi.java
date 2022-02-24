package com.recursion.medium;

public class TowerOfHanoi {
    static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("tranfering "+n+" chip from "+src+" to "+dest);
            return;
        }
        //transfer n-1 chips from src to helper
        towerOfHanoi(n-1, src,dest,helper);
        // transfer last chip to destination
        System.out.println("tranfering "+n+" chip from "+src+" to "+dest);
        // transfer n-1 chips from helper to dest
        towerOfHanoi(n-1, helper, src, dest);


    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n,"source","helper", "dest");

    }
}
