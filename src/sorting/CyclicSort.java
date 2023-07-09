package sorting;
import java.util.Arrays;


public class CyclicSort {
    static void cyclicSort(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    static void cyclicSortRecursion(int[] arr, int column, int row){
        if (row == 0){
            return;
        }

        if (column < row){
            int correct = arr[column] - 1;
            if (arr[column] != arr[correct]){
                swap(arr, column, correct);
                cyclicSortRecursion(arr, column, row);
            }else{
                cyclicSortRecursion(arr, column+1, row);
            }
        }else{
            cyclicSortRecursion(arr, 0, row-1);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int missingNumber(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //int[] arr = {3, 5, 2, 1, 4};
        int[] arr = {4, 0, 2, 1};
        //cyclicSort(arr);
        //cyclicSortRecursion(arr, 0, arr.length-1);
        System.out.println(missingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
