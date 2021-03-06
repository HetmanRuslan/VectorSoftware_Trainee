package com.example;

import java.util.HashSet;
import java.util.Set;

import static com.example.PrintAndValidator.print_board;
import static com.example.PrintAndValidator.valid_board;

public class Main {
    public static void main(String[] args) {

        int [] [] board = {
                {7, 8, 4, 1, 5, 9, 3, 2, 6},
                {5, 3, 9, 6, 7, 2, 8, 4, 1},
                {6, 1, 2, 4, 3, 8, 7, 5, 9},
                {9, 2, 8, 7, 1, 5, 4, 6, 3},
                {3, 5, 7, 8, 4, 6, 1, 9, 2},
                {4, 6, 1, 9, 2, 3, 5, 8, 7},
                {8, 7, 6, 3, 9, 4, 2, 1, 5},
                {2, 4, 3, 5, 6, 1, 9, 7, 8},
                {1, 9, 5, 2, 8, 7, 6, 3, 4},
        };
        print_board(board);
        valid_board(board);
        System.out.println("\n");
        int [] [] board2 = {
                {1, 4, 4, 0, 0, 0, 0, 0, 3},
                {2, 5, 0, 0, 0, 1, 0, 0, 0},
                {3, 0, 9, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 2, 0, 0, 0, 4},
                {0, 0, 0, 4, 1, 0, 0, 2, 0},
                {9, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 9},
                {4, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 1, 0, 0, 8, 0, 0, 7},
        };
        print_board(board2);
        valid_board(board2);
    }


}
