package program8;

import java.util.Scanner;

public class MainUser {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		//UserMainCode userMainCode = new UserMainCode();
		System.out.println(UserMainCode.getString(string));
		scanner.close();
	}

}
