// program  reverse user input string

import java.util.Scanner;

public class UserInputReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		char ch;

		String reverseString = " ";

		// Taking user input using Scanner class
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your string to reverse :\n");

		String userString = scan.next();

		// Traversing across orignal String

		for (int i = 0; i < userString.length(); i++) {

			ch = userString.charAt(i);

			// storing reverse string in new string
			reverseString = ch + reverseString;

		}

		System.out.println("Printing reversed string :" + reverseString);

	}

}
