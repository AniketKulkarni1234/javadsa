public class RatInMaze {

    static int N = 4;

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] sol = new int[N][N];

        if (solveMaze(maze, 0, 0, sol)) {
            print(sol);
        } else {
            System.out.println("No path exists");
        }
    }

    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {

        // destination reached
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {

            sol[x][y] = 1; // choose

            // move Down
            if (solveMaze(maze, x + 1, y, sol))
                return true;

            // move Right
            if (solveMaze(maze, x, y + 1, sol))
                return true;

            // backtracking
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    static void print(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}
