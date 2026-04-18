//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()


package third;
import java.util.Scanner;

public class A3e {
	 public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = removeWhitespace(str);
	        System.out.println("After removing whitespace: " + result);
	    }
}
