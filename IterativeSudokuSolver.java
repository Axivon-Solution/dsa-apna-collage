public class IterativeSudokuSolver {

    public static boolean solveSudoku(int[][] board) {
        int n = 9;

        int row = 0;
        int col = 0;

        // find first empty cell
        while (row < n && board[row][col] != 0) {
            col++;
            if (col == n) {
                col = 0;
                row++;
            }
        }

        if (row == n) return true; // already solved

        // stack to store states (row, col, number)
        int[][] stack = new int[n * n][3];
        int top = -1;

        while (row < n) {
            boolean placed = false;
            int start = board[row][col] + 1;

            // try digits 1–9
            for (int num = start; num <= 9; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    // push current state
                    stack[++top] = new int[]{row, col, num};
                    placed = true;
                    break;
                }
            }

            if (placed) {
                // move to next empty cell
                do {
                    col++;
                    if (col == n) {
                        col = 0;
                        row++;
                    }
                    if (row == n) return true;
                } while (board[row][col] != 0);
            } else {
                // backtrack
                board[row][col] = 0;
                if (top < 0) return false; // no solution
                int[] prev = stack[top--];
                row = prev[0];
                col = prev[1];
                board[row][col] = prev[2];
            }
        }

        return true;
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    public static void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (solveSudoku(sudoku)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
