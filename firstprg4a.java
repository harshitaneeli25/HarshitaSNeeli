//4. Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()



package firstprg;
import java.util.ArrayList;
import java.util.List;

public class firstprg4a {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Extract elements from index 0 to 2 (excluding 2)
        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted elements: " + subList);
    }
}
