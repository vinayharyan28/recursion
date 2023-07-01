package arraysrecusrion;

import java.util.ArrayList;

public class FindElement {
    static boolean isElementPresent(int[] arr, int target, int index){
        if (index == arr.length-1){
            return false;
        }

        return arr[index] == target || isElementPresent(arr, target, index+1);
    }

    static int findIndexOfElement(int[] arr, int target, int index){
        if (index == arr.length){
            System.out.println(arr.length);
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return findIndexOfElement(arr, target, index+1);
    }


    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> storedTarget){
        if (arr[index] == arr.length){
            return storedTarget;
        }
        if (arr[index] == target){
            storedTarget.add(arr[index]);
        }

        return findAllIndex(arr, index+1, target, storedTarget);
    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(arr[index]);
        }

        ArrayList<Integer> result = findAllIndex1(arr, index+1, target);
        result.addAll(list);
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 3, 4, 5};
        ArrayList<Integer> stored = new ArrayList<>();
        System.out.println(isElementPresent(arr, 5, 0));
        System.out.println("index = " + findIndexOfElement(arr, 57, 0));
        System.out.println("find all element = " + findAllIndex(arr, 0, 3, stored));
        System.out.println("find all element in another way = " + findAllIndex1(arr, 0, 3));
    }
}
