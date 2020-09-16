package program2;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		Calculator calculator = new Calculator();
		try{
		System.out.println(calculator.power(number1, number2));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
