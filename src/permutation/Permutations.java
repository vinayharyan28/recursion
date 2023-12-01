package permutation;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationResult("", "abc"));
        System.out.println("vinay".substring(0, 1));
    }

    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutation(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationResult(String presentString, String actualString){
        if (actualString.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(presentString);
            return temp;
        }

        ArrayList<String> answer = new ArrayList<>();
        char character = actualString.charAt(0);
        for (int i=0; i<=presentString.length(); i++){
            String first = presentString.substring(0, i);
            String second = presentString.substring(i);
            answer.addAll(permutationResult(first+character+second, actualString.substring(1)));
        }
        return answer;
    }
}
