package subsetSubsequence;

public class Stream {
    public static void skip(String temp, String actual){
        if (actual.length() == 0){
            System.out.println(temp);
            return;
        }
        char ch = actual.charAt(0);
        if (ch == 'a'){
            skip(temp, actual.substring(1));
        }else {
            skip(temp+ch, actual.substring(1));
        }
    }

    public static String skip(String actual){
        if (actual.isEmpty()){
            return "";
        }
        char temp = actual.charAt(0);
        if (temp == 'a'){
            return skip(actual.substring(1));
        }else {
            return temp + skip(actual.substring(1));
        }
    }

    public static String skipApple(String actual){
        if (actual.isEmpty()) {
            return "";
        }
        if (actual.startsWith("apple")){
            return skipApple(actual.substring(5));
        }else {
            return actual.charAt(0) + skipApple(actual.substring(1));
        }
    }


    public static void main(String[] args) {
        String actual = "vinay";
        skip("", actual);
        System.out.println(skip(actual));
        System.out.println(skipApple("vinaappley"));

    }
}
