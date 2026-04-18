//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast(&quot;Pink&quot;))



package firstprg;
import java.util.*;

public class firstprg8a {
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        // Insert at end
        list.offerLast("Pink");

        System.out.println("After inserting at end:");
        System.out.println(list);
    }
}
