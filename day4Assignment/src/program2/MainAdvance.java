package program2;

import java.util.Scanner;

public class MainAdvance {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		MyCalculator myCalculator = new MyCalculator();
		System.out.println("Sum of divisors of "+num+" is : "+myCalculator.divisorSum(num));
		scanner.close();
	}

}
