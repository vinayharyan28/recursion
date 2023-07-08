package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSortLoop(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int last){
        int maxIndex=last;
        for (int i=0; i<last; i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex=i;
            }
        }return maxIndex;
    }

    static void selectionSortRecursion(int[] arr, int column, int row, int max){
        if (row == 0){
            return;
        }
        if (column < row){
            if (arr[column] > arr[max]) {
                selectionSortRecursion(arr, column+1, row, column);
            }else {
                selectionSortRecursion(arr, column+1, row, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionSortRecursion(arr, 0, row-1, max);
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 31, 222, 1, 3, 0};
//        selectionSortLoop(arr);
        selectionSortRecursion(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

}
