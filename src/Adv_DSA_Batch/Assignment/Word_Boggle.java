package Adv_DSA_Batch.Assignment;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*      4
        GEEKS FOR QUIZ GO
        3 3
        G I Z
        U E K
        Q S E*/
public class Word_Boggle {
    static boolean doFindWord(char[][] grid, String word, int nRow, int nCol, int i, int j, int level){

        //base condtion//
        if(level == word.length()){
            return true;
        }

        //boundary//
        if(i < 0 || j < 0 || i >= nRow || j >= nCol){
            return false;
        }

        if(grid[i][j] == word.charAt(level)){
            //Mark the cell with visited//
            char temp = grid[i][j];
            grid[i][j] = '#';

            //find the next letter in 4 direction//
            //left direction//
            boolean res = doFindWord(grid, word, nRow, nCol, i, j-1, level + 1) |
                    //right direction//
                    doFindWord(grid, word, nRow, nCol, i, j+1, level+1) |
                    //top//
                    doFindWord(grid, word, nRow, nCol, i-1, j, level+1) |
                    //bottom//
                    doFindWord(grid, word, nRow, nCol, i+1, j, level+1) ;
            grid[i][j] = temp;
            return res;
        }else{
            return false;
        }
    }
    static boolean doCheck(char[][] grid, String word, int nRow, int nCol){
        int l = grid.length;
        if(l > nRow * nCol) return false;
        for(int i = 0; i < nRow; i++){
            for(int j = 0; j < nCol; j++){
                if(grid[i][j] == word.charAt(0)){
                    if(doFindWord(grid, word, nRow, nCol, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        //String s = ob.nextLine();
        String[] arr = new String[n];
        //String whole_word = ob.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = ob.next();
        }
        int row = ob.nextInt();
        int col = ob.nextInt();
        char[][] grid = new char[row][col];
        for (int i = 0; i < row; i++) {
            //String temp = ob.nextLine();
            //char[] wordperline = temp.trim().split(" ");
            for (int j = 0; j < col; j++) {
                grid[i][j] = ob.next().charAt(0);
            }
           // System.out.println();
        }
        /*char [][] grid2 = {
                {'G', 'I', 'Z'},
                {'U', 'E', 'K'},
                {'Q', 'S', 'E'}
        };*/
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            String temp = arr[i];
            System.out.println(temp);
            if(doCheck(grid, temp, row, col)) {
                System.out.println(temp + " ");
            }
        }
    }

}
