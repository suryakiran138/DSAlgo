package com.bit.manipulation;

public class Bits {

    public static void main(String[] args) {
        int n = 5; //101
        int pos = 0;

        int bitMask = 1 << pos;

        if((bitMask & n) == 0){
            System.out.println(pos+"th bit is 0");
        }else {
            System.out.println(pos+"th bit is 1");
        }
    }
}
