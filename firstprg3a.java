//3. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)



package firstprg;
import java.util.ArrayList;
import java.util.Collections;

public class firstprg3a {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");

	        Collections.sort(colors);

	        System.out.println("Sorted colors: " + colors);
	    }
}
