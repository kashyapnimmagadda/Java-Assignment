package program7;

import java.util.Scanner;

public class MainPangram {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		Pangram pangram = new Pangram();
		int flag = pangram.pangramString(string);
		if (flag >= 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a pangram");
		}
		scanner.close();
	}

}
