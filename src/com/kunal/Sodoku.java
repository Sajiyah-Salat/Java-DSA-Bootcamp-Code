//package com.kunal;
//
//public class Sodoku {
//    public static void main(String[] args) {
//
//    }
//    static boolean solve(int[][] board) {
//    int n = board.length;
//    int row = -1;
//    int col = -1;
//    // emptyLeft means remaining places to fill
//    //this is how we are replacing r,c from arguments
//    boolean emptyLeft = true;
//        for(int i = 0;i < n; i++){
//        for(int j= 0;j< n; j++){
//            if(board[i][j] == 0){
//                row = i;
//                col = j;
//                emptyLeft = false;
//                break;
//            }
//
//        }
//    }
//        if(emptyLeft == false){
//        break;
//
//
//    }
//        if(emptyLeft == true){
//        return true;
//    }
//    // sodoku is solved
//
//    // backtrack
//        for(int number = 1 ;number< 9;number++){
//        if(isSafe(board,row,col,number)){
//            board[row][col] = number;
//            if(solve(board)){
//                //found the answer
//
//                return true;
//            }
//            else{
//                //backtrack
//                board[row][col] = 0;
//            }
//        }
//    }
//        return false;
//}
//    void display(int[][] board){
//        for(int[] row: board){
//            for(int num: row){
//                System.out.print(num + " ")
//            }
//            System.out.println();
//        }
//    }
//
//    boolean isSafe(int[][] board, int row ,int col, int num){
//        // check the row
//        for(int i = 0; i < board.lenght; i++){
//            // check the num is in the row
//            if (board[row][i] == num){
//                return false;
//            }
//        }
//        // check the col
//        for(int nums: board){
//            // check the num is in the col
//            if (nums[col] == num){
//                return false;
//            }
//
//        }
//        int sqrt = (int)(Math.sqrt(board.lenght));
//        int rowStart = row - row % sqrt;
//        int colStart = col - col % sqrt;
//
//        for(int r = rowStart ; r < rowStart + sqrt; r++){
//            for(int c = colStart; c< colStart; c++){
//                if(board[r][c] == nums){
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
//
//
//}
