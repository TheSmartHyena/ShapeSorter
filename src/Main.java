import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShape> list = new ArrayList<>();

        IShape b = new Square(3);
        IShape c = new Square(2);
        IShape a = new Square(4);

        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        // Collections.reverse(list);

        for (IShape item : list) {
            System.out.println(item.area());
        }
    }
}