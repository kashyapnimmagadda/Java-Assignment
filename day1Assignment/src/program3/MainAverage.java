package program3;

import java.util.Scanner;

public class MainAverage {

	public static void main(String[] args) {
		Average average = new Average();
		System.out.println("Enter 3 numbers : ");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		System.out.println("Average of given numbers is "
				+ average.averagenumber(number1, number2, number3));
		scan.close();

	}

}
