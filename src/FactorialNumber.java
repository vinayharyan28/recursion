public class FactorialNumber {
    public static int factorialNumber(int number){
        if (number == 1)
            return 1;
        return factorialNumber(number-1) * number;
    }

    public static int sumNNumbers(int number){
        if (number==1)
            return 1;
        return sumNNumbers(number-1) + number;
    }
    public static void main(String[] args) {
        System.out.println("Factorial number = " + factorialNumber(5));
        System.out.println("Sum of given number = " + sumNNumbers(5));
    }
}
