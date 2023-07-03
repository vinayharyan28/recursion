package patterns;

public class Triangle {
    public static void main(String[] args){
        triangle(4, 0);
        System.out.println();
        reverseTriangle(4, 0);
    }

    static void triangle(int row, int column){
        if (row == 0){
            return;
        }
        if (column < row){
            System.out.print("*");
            triangle(row, column+1);
        }else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void reverseTriangle(int row, int columns){
        if (row == 0){
            return;
        }
        if (columns < row){
            reverseTriangle(row, columns+1);
            System.out.print("*");
        }else{
            reverseTriangle(row-1, 0);
            System.out.println();
        }
    }
}
