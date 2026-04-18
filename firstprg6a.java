package firstprg;
import java.util.*;

public class firstprg6a {
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Start from 2nd position (index 1)
        Iterator<String> iterator = list.listIterator(1);

        System.out.println("Elements from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
