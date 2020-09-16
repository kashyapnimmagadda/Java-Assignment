package program5;

import java.util.Scanner;

public class MainSubString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println("Enter two indices to print the substring : ");
		int number1= scanner.nextInt();
		int number2 = scanner.nextInt();
		SubString subString = new SubString();
		System.out.println(subString.editString(string, number1, number2));
		scanner.close();
	}

}
