package backtracking;

public class BackTracking {
    static void findAllPath(String p, boolean[][] maze, int r, int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        // I am considering this block my path
        maze[r][c] = false;

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

        // this line is where the function will be over
        // so before the function gets removed,
        // also remove the changes that were made by that function

        maze[r][c] = true;
    }

    public static void main(String[] args){
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        findAllPath("", board, 0, 0);
    }
}
