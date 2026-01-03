public class KnightsTour {

    static int N = 8;

    // Knight moves
    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        // initialize board with -1
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }

        // starting position
        board[0][0] = 0;

        if (solveKT(board, 0, 0, 1)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    static boolean solveKT(int[][] board, int x, int y, int move) {

        // base case
        if (move == N * N) {
            return true;
        }

        // try all 8 moves
        for (int k = 0; k < 8; k++) {
            int nextX = x + dx[k];
            int nextY = y + dy[k];

            if (isSafe(board, nextX, nextY)) {
                board[nextX][nextY] = move;

                if (solveKT(board, nextX, nextY, move + 1)) {
                    return true;
                }

                // backtracking
                board[nextX][nextY] = -1;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int x, int y) {
        return (x >= 0 && x < N &&
                y >= 0 && y < N &&
                board[x][y] == -1);
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
