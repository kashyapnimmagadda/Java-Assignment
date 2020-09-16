package program6;

import java.util.Scanner;

public class MainAscii {

	public static void main(String[] args) {
		System.out.println("Enter a charecter");
		Scanner scanner = new Scanner(System.in);
		char charecter = scanner.next().charAt(0);
		Ascii ascii = new Ascii();
		System.out.println("Ascii value is "+ascii.value(charecter));
		scanner.close();
	}

}
