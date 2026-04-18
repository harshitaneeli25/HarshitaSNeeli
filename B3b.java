package third;

import java.util.Scanner;

public class B3b {
	public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter max length: ");
        int len = sc.nextInt();

        System.out.println("Truncated: " + truncate(str, len));
    }
}
