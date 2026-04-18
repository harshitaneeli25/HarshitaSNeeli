//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().

package third;
import java.util.Scanner;
public class A3c {
	public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
}
