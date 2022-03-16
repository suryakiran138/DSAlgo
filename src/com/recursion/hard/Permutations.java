package com.recursion.hard;

public class Permutations {

    static void printPermutations(String input,String perm){
        if(input.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<input.length();i++){
            char currentChar = input.charAt(i);
            String output = input.substring(0,i)+input.substring(i+1);
            printPermutations(output,perm+currentChar);
        }
    }


    public static void main(String[] args) {
        String str = "abcdef";
        printPermutations(str, "");
    }
}
