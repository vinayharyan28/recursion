public class Print1to5numbers {
    public static void printNumbers(int number){
        if (number == 0)
            return;
        System.out.println(number);
        printNumbers(number-1);
    }

    public static void printNumbers2(int number){
        if (number == 0)
            return;
        printNumbers2(number-1);
        System.out.println(number);
    }

    public static void normalAndReverse(int number){
        if (number == 0)
            return;
        System.out.print(number + " ");
        normalAndReverse(number-1);
        System.out.print(number +  " ");
    }

    public static void main(String[] args){
//        printNumbers(5);
        System.out.println();
//        printNumbers2(5);
        normalAndReverse(5);
    }
}
