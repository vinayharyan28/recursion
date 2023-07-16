import java.util.ArrayList;

public class CodeTest {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        t1.add(1);
        t2.add(2);
        t.addAll(t1);
        t.addAll(t2);
        System.out.println(t);

    }
}
