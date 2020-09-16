package program1;
//1.	Write a Java program to convert all the characters in a string to lowercase.
import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(string.toLowerCase());
		scanner.close();
	}

}
