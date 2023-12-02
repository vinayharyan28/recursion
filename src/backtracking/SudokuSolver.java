package backtracking;

public class SudokuSolver{
    static boolean isSafe(int[][] sudoku, int row, int columns, int digit){
        //Column
        for (int i=0; i<=8; i++){
            if(sudoku[i][columns] == digit){
                return false;
            }
        }

        //Row
        for (int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        //Grid
        int startingRow = (row/3) * 3;
        int startingColumn = (columns/3) * 3;
        for (int i=startingRow; i<startingRow+3; i++){
            for (int j=startingColumn; j<startingColumn+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean sudokuSolver(int[][] sudoku, int row, int column){

        if (row == 9 && column == 0){
            return true;
        }

        int nextRow = row;
        int nextColumn = column+1;
        if (column + 1 == 9){
            nextRow = row + 1;
            nextColumn = 0;
        }

        if (sudoku[row][column] != 0){
            return sudokuSolver(sudoku, nextRow, nextColumn);
        }

        for (int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, column, digit)){
                sudoku[row][column] = digit;
                if (sudokuSolver(sudoku, nextRow, nextColumn)){ // Solution exists
                    return true;
                }
                sudoku[row][column] = 0;
            }
        }
        return false;
    }

    static void printSudoku(int[][] sudoku){
        for (int[] row: sudoku){
            for (int column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] sudoku = {
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
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else {
            System.out.println("Solution not exists");
        }
    }

}