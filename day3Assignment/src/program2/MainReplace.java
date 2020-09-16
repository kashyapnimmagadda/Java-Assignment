package program2;

import java.util.Scanner;

public class MainReplace {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] letters = new char[string.length()];
		
		Replace replace = new Replace();
		letters = replace.replaceh(string);
		String result = String.valueOf(letters);	
		System.out.println(result);
		scanner.close();
	}

}
