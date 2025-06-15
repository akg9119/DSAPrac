package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 4; //  Set the size of the chessboard (n x n)

        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        //  Initialize the board with '.' indicating empty cells
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        //  Start solving the N-Queens problem using backtracking
        solve(board, 0, n, ans);

        //  Print all the valid solutions
        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println("---------");
        }
    }

    /**
     *  N-Queens Problem Explanation:
     * --------------------------------
     * Goal: Place N queens on an N x N chessboard such that no two queens attack each other.
     * 
     * A Queen can attack:
     * - Vertically ↑ ↓
     * - Horizontally ← →
     * - Diagonally ↖ ↘ ↙ ↗
     * 
     * Approach:
     * - Use backtracking (try one option → move forward → backtrack if it fails)
     * - Place one queen per row, trying all columns
     * - Check for safety before placing
     * - If a position is unsafe or doesn't lead to a solution, undo and try next option
     * - If all queens are placed, store the current board as a solution
     */

    public static void solve(char[][] board, int row, int n, List<List<String>> ans) {
        //  Base case: All queens are placed successfully
        if (row == n) {
            ans.add(buildBoard(board)); // Store the valid arrangement
            return;
        }

        //  Try placing queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';             // Place the queen
                solve(board, row + 1, n, ans);     // Recurse for next row
                board[row][col] = '.';             // Backtrack and remove queen
            }
        }
    }

    /**
     *   Check if placing a queen at (row, col) is safe:
     * - No other queen in the same column
     * - No queen in the upper-left diagonal
     * - No queen in the upper-right diagonal
     */
    private static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false; // Check column
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false; // Check top-left diagonal
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false; // Check top-right diagonal
        }

        return true;
    }

    /**
     * Convert the 2D board into a list of strings
     * Example Output for 4-Queens:
     * .Q..
     * ...Q
     * Q...
     * ..Q.
     */
    private static List<String> buildBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row)); // Convert each row to a string
        }
        return res;
    }
}
