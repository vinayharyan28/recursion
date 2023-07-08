package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSortLoop(int[] arr){
        boolean swapped = false;
        for (int i=0; i<arr.length; i++){
            swapped=false;
            for (int j=1; j<arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    static void bubbleSortRecursion(int[] arr, int column, int row){
        if (row == 0){
            return;
        }

        if (column < row){
            if (arr[column] > arr[column+1]){
                int temp = arr[column];
                arr[column] = arr[column+1];
                arr[column+1] = temp;
            }
            bubbleSortRecursion(arr, column+1, row);
        }else {
            bubbleSortRecursion(arr, 0, row-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
//        bubbleSortLoop(arr);
        bubbleSortRecursion(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

