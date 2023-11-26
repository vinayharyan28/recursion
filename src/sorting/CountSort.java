package sorting;


import java.util.Arrays;

public class CountSort {
    // Range is less
    static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int j : arr) {
            largest = Math.max(largest, j);
        }

        int[] count = new int[largest+1];
        for (int j : arr) {
            count[j]++;
        }

        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    // Try using recursion
    private static int findLargest(int[] arr, int index, int largest){
        if (index == arr.length-1){
            return largest;
        }
        return findLargest(arr, ++index, Math.max(largest, arr[index]));
    }

    private static int[] createArrayForCountStorage(int[] count, int index, int[] arr){

        if (index == arr.length){
            return count;
        }
        count[arr[index]]++;
        return createArrayForCountStorage(count, index+1, arr);
    }

    private static int[] recursionSort(int[] count, int index, int[] arr, int arrIndex){
        if(index == arr.length-1){
            arr[arrIndex] = index;
            return arr;
        }

        if (count[index] > 0){
            arr[arrIndex] = index;
            count[index]--;
            return recursionSort(count, index, arr, arrIndex + 1);
        }else {
            return recursionSort(count, index + 1, arr, arrIndex);
        }
    }

    static void countSortUsingRecursion(int[] arr){
        int largest = findLargest(arr, 0, Integer.MIN_VALUE);
        int[] elementCountArray = createArrayForCountStorage(new int[largest+1], 0, arr);
        recursionSort(elementCountArray, 1, arr, 0);
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 3, 2, 1, 2, 5, 8, 9, 10, 9};
        int[] arr2 = {3, 4, 3, 2, 1, 2, 5, 8, 9, 10, 9};
        countSortUsingRecursion(arr1);
        System.out.println("Using recursion: " + Arrays.toString(arr1));
        countSort(arr2);
        System.out.println("Using loop: " + Arrays.toString(arr2));

    }
}
