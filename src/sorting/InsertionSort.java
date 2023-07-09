package sorting;
import java.util.Arrays;

public class InsertionSort {
    static void insertionSortLoop(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            System.out.println();
            for (int j=i+1; j>0; j--){
                System.out.print("hi");
                if (arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void insertionSortRecursion(int[] arr, int column, int row){
        if (row == arr.length){
            return;
        }
        if (column > 0){
            if (arr[column]<arr[column-1]){
                int temp = arr[column];
                arr[column] = arr[column-1];
                arr[column-1] = temp;
            }
            insertionSortRecursion(arr, column-1, row);
        }else{
            System.out.println();
            insertionSortRecursion(arr, row+1, row+1);
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
//        insertionSortLoop(arr);
        insertionSortRecursion(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
