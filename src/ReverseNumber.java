public class ReverseNumber {
    public static void main(String[] args){
        reverseNumber(1234);
        System.out.println();
        reverseNumber2(1234);
        System.out.println(sum);
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

}
