package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static boolean isSafe(char[][] board, List<List<String>> result, int row, int col){
        // check horizontally
        for(int i=0;i<board.length;i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        // check veritically
        for(int i=0;i<board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // top right
        for(int i=row,j=col;i<board.length&&j<board.length;i++,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // top left
        for(int i=row,j=col;i>-1&&j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // bottom right
        for(int i=row,j=col;i< board.length&&j>-1;i++,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // bottom left
        for(int i=row,j=col;i>-1&&j>-1;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }

    public static void saveBoard(char[][] board, List<List<String>> result){


        List<String> newBoard = new ArrayList<>();

        for(int i=0;i < board.length;i++){
            String row = "";
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += "Q";
                } else {
                    row += ".";
                }
            }
            newBoard.add(row);
        }
        result.add(newBoard);
        return;

    }

    public static void helper(char[][] board, List<List<String>> result, int col){
        if(col == board.length){
            saveBoard(board, result);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(board,result,row,col)){
                board[row][col] = 'Q';
                helper(board, result, col+1);
                board[row][col] = '.';
            }
        }

    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, result, 0);
        return result;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        for(List<String> row:result){
            for(String s: row){
                System.out.print(s+"");
            }
            System.out.println();
        }
    }
}
