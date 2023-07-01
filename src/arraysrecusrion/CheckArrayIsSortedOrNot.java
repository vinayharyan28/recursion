package arraysrecusrion;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(isArraySorted(arr, 0));
    }

    public static boolean isArraySorted(int[] arr, int start){
        if (start == arr.length - 1){
            return true;
        }
        return arr[start] < arr[start+1] && isArraySorted(arr, start+1);
    }
}
