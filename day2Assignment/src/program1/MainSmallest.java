package program1;

import java.util.Scanner;

public class MainSmallest {

	public static void main(String[] args) {
		System.out.println("Enter 3 Numbers :");
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[3];
		for (int i = 0; i < 3; i++) {
			number[i] = scanner.nextInt();
		}
		SmallestNumber smallestNumber = new SmallestNumber();
		System.out.println(smallestNumber.small(number));
		scanner.close();
	}

}
