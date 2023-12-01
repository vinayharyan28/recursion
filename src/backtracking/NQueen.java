package backtracking;
public class NQueen {
    static int count = 0;
    static void printBoard(char[][] board){
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(char[][] board, int row, int column){
        //Vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][column] == 'Q'){
                return false;
            }
        }
        //Left diagonal up
        for (int i=row-1, j=column-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Right diagonal up
        for(int i=row-1, j=column+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static boolean nQueen(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            System.out.println();
            count++;
            return true;
        }
        for (int j=0; j<board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                if (nQueen(board, row+1)){
                    return true; // Only one solution run at a time
                }
                board[row][j] = 'X';
            }
        }
        return false;

    }
    static void nQueen(int n){
        char[][] chessBord = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessBord[i][j] = 'X';
            }
        }
        nQueen(chessBord, 0);
    }
    public static void main(String[] args) {
        int n = 4;
        nQueen(n);
        System.out.println(count);
    }
}
 