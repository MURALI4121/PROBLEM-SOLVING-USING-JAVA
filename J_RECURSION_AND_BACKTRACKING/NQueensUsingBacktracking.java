package J_RECURSION_AND_BACKTRACKING;

class NQueensUsingBacktracking {
    public static void main(String[] args) {
        int N = 4; // Change N to the desired number of queens/board size
        solveNQueens(N);
    }

    public static void solveNQueens(int N) {
        int[][] board = new int[N][N];

        if (solveNQueensUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col) {
        if (col >= board.length) {
            return true; // All queens placed
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1; // Place queen

                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0; // Backtrack
            }
        }

        return false; // No position found
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 1) ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

