package com.backtracking;

public class SudokuGrid {

    public boolean isSafe(char[][] board, int row, int col, int num){
        char charNum = (char)(num + '0');
        // check it is row safe
        for(int i=0;i< board.length;i++){
            if(board[row][i] == charNum){
                return false;
            }
        }
        // check it is col safe
        for(int i=0;i< board.length;i++){
            if(board[i][col] == charNum){
                return false;
            }
        }
        // check it is grid safe
        int gRow = (row/3)*3;
        int gCol = (col/3)*3;
        for(int i=gRow;i<gRow+3;i++){
            for(int j=gCol;j<gCol+3;j++){
                if(board[i][j] == charNum){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nRow,nCol;

        if(col!=board.length-1){
            nRow = row;
            nCol = col+1;
        }else {
            nRow = row+1;
            nCol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nRow, nCol)){
                return true;
            }
        } else {
            for(int i=1;i<=9;i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i+'0');
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board){
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        // TO-DO need to implement taking input
    }
}
