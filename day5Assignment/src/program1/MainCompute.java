package program1;

import java.util.Scanner;

public class MainCompute {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		try {
			if (scanner.hasNextInt()) {
				number1 = scanner.nextInt();
			} else {
				throw new InputMismatchException();
			}
			if (scanner.hasNextInt()) {
				number2 = scanner.nextInt();
			} else {
				throw new InputMismatchException();
			}
			Compute compute = new Compute();
			System.out.println("Division of two numbers : "
					+ compute.divide(number1, number2));
		} catch (InputMismatchException | ArithmeticException ie) {
			System.out.println(ie.toString());
		} finally {
			scanner.close();
		}
	}

}
