package program6;

import java.util.Scanner;

public class MainPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		Palindrome palindrome = new Palindrome();
		int flag=palindrome.isPalindrome(string);
		if(flag>0){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		scanner.close();
	}
}
