//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():



package third;
import java.util.Scanner;
public class A3d {
	 public static boolean isPalindrome(String str) {
	        // Remove punctuation and spaces, convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        String reversed = new StringBuilder(cleaned).reverse().toString();

	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        if (isPalindrome(str)) {
	            System.out.println("It is a palindrome.");
	        } else {
	            System.out.println("Not a palindrome.");
	        }
	    }
}
