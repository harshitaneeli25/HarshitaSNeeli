package firstprg;
import java.util.*;

public class firstprg7a {
	 public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        Iterator<String> iterator = list.descendingIterator();

	        System.out.println("Elements in reverse order:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
