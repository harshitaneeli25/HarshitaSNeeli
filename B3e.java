//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()


package third;

import java.util.Scanner;

public class B3e {
	public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Number of words: " + countWords(str));
    }
}
