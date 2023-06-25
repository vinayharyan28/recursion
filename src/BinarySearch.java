public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int middle = start + (end - start);
        if (arr[middle] == target){
            return middle;
        }

        if (arr[middle] < target){
            return binarySearch(arr, target, middle+1, end);
        }

        return binarySearch(arr, target, 0, middle-1);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 88, 99, 100};
        int result = binarySearch(arr, 89, 0, arr.length-1);
        System.out.println(result);
    }
}
