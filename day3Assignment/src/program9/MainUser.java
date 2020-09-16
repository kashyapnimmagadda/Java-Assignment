package program9;

import java.util.Scanner;

public class MainUser {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println("Enter a charecter : ");
		char charecter = scanner.next().charAt(0);
		UserMainCode userMainCode = new UserMainCode();
		System.out.println(userMainCode.stringEdit(string,charecter));
		scanner.close();
	}

}
