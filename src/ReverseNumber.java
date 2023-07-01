public class ReverseNumber {
    public static void main(String[] args){
        reverseNumber(1234);
        System.out.println();
        reverseNumber2(1234);
        System.out.println(sum);
        System.out.println("Testing "+ reverse3(1234));
    }

    public static void reverseNumber(int number){
        if (number%10 == number){
            System.out.println(number);
            return;
        }

        System.out.println(number%10);
        reverseNumber(number/10);
    }

    static int sum = 0;
    public static void reverseNumber2(int number){
        if (number == 0)
            return;
        int remainder = number % 10;
        sum = sum * 10 + remainder;
        reverseNumber2(number/10);
    }

    static int reverse3(int n){
        int digit = (int)(Math.log10(n) + 1);
        return helper(n, digit);
    }

    static int helper(int n, int digit){
        if (n%10 == n){
            return n;
        }
        int remainder = n%10;
        return remainder * (int) Math.pow(10, digit-1) + helper(n/10, digit-1);
    }

}
