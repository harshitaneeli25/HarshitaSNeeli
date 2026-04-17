package firstprg;
import java.util.ArrayList;
public class firstprg1a {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        if (colors.contains("Red")) {
            System.out.println("Red is available in the list.");
        } else {
            System.out.println("Red is not available in the list.");
        }
    }
}
