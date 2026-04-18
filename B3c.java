package third;

import java.util.Scanner;

public class B3c {
	public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isNumeric(str)) {
            System.out.println("String contains only numeric characters.");
        } else {
            System.out.println("String is not numeric.");
        }
    }
}
