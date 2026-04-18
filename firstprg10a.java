package firstprg;
import java.util.*;

public class firstprg10a {
	 public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Swap first (index 0) and third (index 2)
	        Collections.swap(list, 0, 2);

	        System.out.println("After swapping first and third elements:");
	        System.out.println(list);
	    }
}
