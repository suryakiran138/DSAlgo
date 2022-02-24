package com.recursion.medium;

public class SubSequences {

    static void subSequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to include currentChar
        subSequences(str,idx+1,newString+currentChar);
        // to not include currentChar
        subSequences(str,idx+1,newString);
    }


    public static void main(String[] args) {
        String str = "abc";
        subSequences(str,0,"");
    }

}
