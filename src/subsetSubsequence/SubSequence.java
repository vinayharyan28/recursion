package subsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    static void subSequence(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p, up.substring(1));
        subSequence(p+ch, up.substring(1));
    }

    static ArrayList<String> subSequence2(String temp, String actual){
        if (actual.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
            return list;
        }

        char character = actual.charAt(0);
        ArrayList<String> left = subSequence2(temp, actual.substring(1));
        ArrayList<String> right = subSequence2(temp+character, actual.substring(1));
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr){
            int n = outer.size();
            for (int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                System.out.println("Internal = " + internal);
                outer.add(internal);
                System.out.println("Outer = " + outer);
            }
        }return outer;
    }

    public static void main(String[] args){
        subSequence("", "abc");
        System.out.println("subSequence2 = " + subSequence2("", "abc"));
        int[] arr = {1, 2, 3};
        System.out.println("subset arr = " + subset(arr));


    }
}
