public class DigitSum {
    public static void main(String[] args) {
        System.out.println("sum = " + sumOfDigit(1342));
        System.out.println("product = " + productOfDigit(1342));
    }

    public static int sumOfDigit(int number){
        if (number==0)
            return 0;
        return number%10 + sumOfDigit(number/10);
    }

    public static int productOfDigit(int number){
        if (number%10 == number)
            return number;
        return number%10 * productOfDigit(number/10);
    }
}
