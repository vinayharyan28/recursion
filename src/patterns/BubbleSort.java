package patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {1, 2, 9, 0, 8, 3};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int start, int end){
        if (start == 0){
            return;
        }

        if (end < start){
            if (arr[end] > arr[end+1]){
                int temp = arr[end];
                arr[end] = arr[end+1];
                arr[end+1] = temp;
            }
            bubbleSort(arr, start, end+1);
        }else{
            bubbleSort(arr, start-1, 0);
        }
    }
}
