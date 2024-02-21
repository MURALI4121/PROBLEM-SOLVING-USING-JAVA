package J_RECURSION_AND_BACKTRACKING;

class SudokuSolver {
    public static final int SIZE = 9;

    public static void main(String[] args) {
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

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Find an empty cell (marked with 0)
                if (board[row][col] == 0) {
                    // Try all possible numbers
                    for (int number = 1; number <= SIZE; number++) {
                        if (isValidPlacement(board, row, col, number)) {
                            // Place number in the cell
                            board[row][col] = number;

                            if (solveSudoku(board)) {
                                // If solved, return true
                                return true;
                            } else {
                                // Else, backtrack
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Puzzle solved
    }

    private static boolean isValidPlacement(int[][] board, int row, int col, int number) {
        // Check row and column
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number || board[i][col] == number) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int subRowStart = row - row % 3;
        int subColStart = col - col % 3;

        for (int subRow = 0; subRow < 3; subRow++) {
            for (int subCol = 0; subCol < 3; subCol++) {
                if (board[subRowStart + subRow][subColStart + subCol] == number) {
                    return false;
                }
            }
        }

        return true; // No conflict
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}

