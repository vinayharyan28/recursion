package backtracking;

public class GridWays {
    static int gridWays(int i, int j, int n, int m){
        if (i == n-1 && j == m-1){ // Condition for last cell
            return 1;
        }else if (i == n || j == n){ //Boundary cross condition
            return 0;
        }
        int way1 = gridWays(i+1, j, n, m);
        int way2 = gridWays(i, j+1, n, m);
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
