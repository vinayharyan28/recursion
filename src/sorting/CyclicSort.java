package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        return arr.length;
    }

    static List<Integer> findDisappearedNumbers(int[] numbers){
        int i=0;
        while (i < numbers.length){
            int correct = numbers[i] - 1;
            if (numbers[i] != numbers[correct]){
                swap(numbers, i, correct);
            }else{
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index=0; index < numbers.length; index++){
            if (numbers[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static int findDuplicate(int[] arr){
        int i=0;
        while (i < arr.length){
            if (arr[i] != i+1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }
        }return -1;
    }

    static List<Integer> findAllDuplicate(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index=0; index<arr.length; index++){
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static int[] findDuplicateMissing(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        for (int index=0; index<arr.length; index++){
            if (arr[index] != index+1){
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args){
        //int[] arr = {3, 5, 2, 1, 4};
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findDuplicateMissing(arr)));
//        System.out.println(findDisappearedNumbers(arr));
//        System.out.println(findDuplicate(arr));
        //cyclicSort(arr);
        //cyclicSortRecursion(arr, 0, arr.length-1);
//        System.out.println(missingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
