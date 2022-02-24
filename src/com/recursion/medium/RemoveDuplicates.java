package com.recursion.medium;

public class RemoveDuplicates {

    static void removeDuplicates(String str,int idx, String result){
        if(idx == str.length()){
            System.out.println("result: "+result);
            return;
        }

        if(result.contains(str.charAt(idx)+"")){
            removeDuplicates(str,idx+1,result);
        }else {
            result += (str.charAt(idx)+"");
            removeDuplicates(str,idx+1,result);
        }
    }


    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str,0, "");
    }
}
