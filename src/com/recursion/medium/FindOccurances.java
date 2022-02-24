package com.recursion.medium;

public class FindOccurances {

    static void findOccurances(String str,char c,int first,int last,int n){
        if(n == str.length()){
            System.out.println("first occurance: "+first+"last occurance: "+last+" on string: "+str+"for char: "+c);
            return;
        }
        if(str.charAt(n) == c){
            if(first == -1){
                first = n;
            }
            last = n;
        }
        findOccurances(str,c,first,last,n+1);
    }

    public static void main(String[] args) {
        String str = "adfaasdagfaasdadf";
        char c = 'a';
        findOccurances(str,c,-1,-1, 0);

    }
}
