package program3;

import java.util.Scanner;

public class MainCount {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		CountVowels countVowels = new CountVowels();
		System.out.println(countVowels.vowelsCount(string));
		scanner.close();
	}

}
