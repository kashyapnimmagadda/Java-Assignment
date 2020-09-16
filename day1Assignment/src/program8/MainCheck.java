package program8;

import java.util.Scanner;

public class MainCheck {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int number = scanner.nextInt();
		CheckSum checkSum = new CheckSum();
		int flag=checkSum.digits(number);
		if(flag==0){
			System.out.println("Sum of the digits is even");
		}
		else
			System.out.println("Sum of the digits is odd");
		scanner.close();
	}

}
