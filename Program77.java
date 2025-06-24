
public class Program77 {

    //SUDOKU  GAME SOLVER
    // time complexity : O(9^n) 
    // Sudoku board size is 9x9
    public static final int SIZE = 9;

    public static void main(String[] args) {
        // 0 represents an empty cell in Sudoku
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Try solving the board and print result
        if (solveSudoku(board)) {
            printBoard(board);  // If solved, print the board
        } else {
            System.out.println("No solution exists!");
        }
    }

    // Solves the Sudoku using Backtracking
    public static boolean solveSudoku(int[][] board) {
        // Traverse through the board
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Find an empty cell
                if (board[row][col] == 0) {
                    // Try all numbers 1 through 9
                    for (int num = 1; num <= 9; num++) {
                        // Check if placing num is valid here
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number

                            // Recur to try to solve rest of the board
                            if (solveSudoku(board)) {
                                return true; // Solved!
                            }

                            // Backtrack if not solved, reset cell
                            board[row][col] = 0;
                        }
                    }
                    // If no number is valid, return false to backtrack
                    return false;
                }
            }
        }
        // If no empty cells are left, puzzle is solved
        return true;
    }

    // Checks if placing a number at board[row][col] is valid
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if number exists in the current row
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check if number exists in the current column
        for (int x = 0; x < SIZE; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Check if number exists in the current 3x3 box
        int startRow = row - row % 3; // Top-left row of the box
        int startCol = col - col % 3; // Top-left col of the box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        // Safe to place the number
        return true;
    }

    // Prints the board in 9x9 format
    public static void printBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
