public class Main {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int i){
        if (i > 5){
            return;
        }
        System.out.println("Hello World");
        message(i+1);
    }
}