package program5;

import java.util.Scanner;

public class MainPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner =new Scanner(System.in);
		int number = scanner.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		int count=primeNumber.isprime(number);
		if(count >=1){
			System.out.println(number+" is not a prime number");
		}
		else{
			System.out.println(number+" is Prime number");
		}
		scanner.close();
	}

}
