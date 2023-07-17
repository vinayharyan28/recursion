package backtracking;

public class AllPathFinding {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        findAllPath("", board, 0, 0);
    }
    static void findAllPath(String p, boolean[][] maze, int r, int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length - 1){
            findAllPath(p+'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1){
            findAllPath(p+'R', maze, r, c+1);
        }

        if (r > 0){
            findAllPath(p+'U', maze, r-1, c);
        }

        if (c > 0){
            findAllPath(p+'L', maze, r, c-1);
        }
    }
}
