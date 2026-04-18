package firstprg;
import java.util.ArrayList;

public class firstprg2a {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        System.out.println("After removal: " + colors);
    }
}
