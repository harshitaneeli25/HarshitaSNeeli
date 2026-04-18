package second;
import java.util.*;

public class StringOperationsDemo {
	public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0-4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("After replace: " + modified);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Java   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String sentence = "Java,Python,C,C++";
        String[] parts = sentence.split(",");
        System.out.println("Splitted Strings:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        double marks = 88.567;
        String formatted = String.format("Name: %s, Age: %d, Marks: %.2f", name, age, marks);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
