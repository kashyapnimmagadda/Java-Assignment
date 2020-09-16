package program9;

import java.util.Scanner;

public class MainUser {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(UseMainCode.sumOfSquaresOfEvenDigits(number));
		scanner.close();
	}

}
