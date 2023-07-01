public class CountZero {
    public static void main(String[] args){
        System.out.println("Count = " + countZero(0, 30204));
    }

    static int countZero(int count, int number){
        int remainder = number%10;
        if (number == 0){
            return count;
        }
        if (remainder == 0){
            count += 1;
        }
        return countZero(count, number/10);
    }
}
