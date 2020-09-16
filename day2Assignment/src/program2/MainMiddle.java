package program2;

import java.util.Scanner;

public class MainMiddle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		MiddleCharecter middleCharecter = new MiddleCharecter();
		char[] result = middleCharecter.middle(string);
		if (string.length() % 2 == 0) {
			for (int i = 0; i < 2; i++) {
				System.out.println(result[i]);
			}
		} else {
			System.out.println(result[0]);
		}
		scanner.close();
	}

}
