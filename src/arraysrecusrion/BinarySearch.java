package arraysrecusrion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 10, 12, 44, 45};
        System.out.println(binarySearch(arr, 0, arr.length-1, 45));
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        if (start > end) {
            return -1;
        }
        int middleElement = (start + end)/2;
        if (arr[middleElement] == target){
            return middleElement;
        }
        if (arr[middleElement] < target){
            return binarySearch(arr, middleElement+1, end, target);
        }
        return binarySearch(arr, start, middleElement-1, target);
        }

}
