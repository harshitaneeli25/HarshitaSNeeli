//5. Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index


package firstprg;
import java.util.ArrayList;

public class firstprg5a {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // Delete 3rd element (index starts from 0)

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting nth element: " + colors);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
