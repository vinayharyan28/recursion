public class Palindrome {
    public static void main(String[] args){
        int n = 1232;
        palindrome(n);
    }

    static void palindrome(int n){
        int result = ReverseNumber.reverse3(n);
        if (result == n){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
