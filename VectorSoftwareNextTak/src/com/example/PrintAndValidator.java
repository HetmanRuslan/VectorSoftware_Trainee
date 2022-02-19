package com.example;

import java.util.HashSet;
import java.util.Set;

public class PrintAndValidator {
    public static int valid_row(int row, int [][] grid){
        int temp[] = grid[row];
        Set<Integer> set = new HashSet<Integer>();
        for (int value : temp) {

            if (value < 0 || value > 9){
                System.out.println( "\nInvalid value!" );
                return -1;
            }

            else if (value != 0){
                if (set.add(value) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int valid_col(int col, int [][] grid){
        Set<Integer>set = new HashSet<Integer>();
        for (int i =0 ; i< 9; i++) {

            if (grid[i][col] < 0 || grid[i][col] > 9){
                System.out.println( "\nInvalid value!" );
                return -1;
            }

            else if (grid[i][col] != 0){
                if (set.add(grid[i][col]) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int valid_subsquares(int [][] grid){
        for (int row = 0 ; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                Set<Integer>set = new HashSet<Integer>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){

                        if (grid[r][c] < 0 || grid[r][c] > 9){
                            System.out.println( "\nInvalid value" );
                            return -1;
                        }

                        else if (grid[r][c] != 0){
                            if (set.add(grid[r][c]) == false) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static void valid_board(int [][] grid){

        for (int i =0 ; i< 9; i++) {
            int res1 = valid_row(i, grid);
            int res2 = valid_col(i, grid);

            if (res1 < 1 || res2 < 1) {
                System.out.println( "\nThe board is invalid." );
                return;
            }
        }
        int res3 = valid_subsquares(grid);

        if (res3 < 1) {
            System.out.println( "\nThe board is invalid." );
        }
        else {
            System.out.println( "\nThe board is valid." );
        }
    }

    public static void print_board(int [][] grid){
        for (int[] row : grid) {
            System.out.print("[");
            for (int y : row) {
                System.out.print(y + ", ");
            }
            System.out.println("]");
        }
    }
}
