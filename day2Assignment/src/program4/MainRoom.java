package program4;

import java.util.Scanner;

public class MainRoom {

	public static void main(String[] args) {
		System.out.println("Enter a Room Number :");
		Scanner scanner = new Scanner(System.in);
		int roomNo = scanner.nextInt();
		System.out.println("Enter Room Type (A OR B OR C):");
		char roomType = scanner.next().charAt(0);
		System.out.println("Enter Room Area :");
		String roomArea = scanner.next();
		System.out.println("Is ACmachine is available (Y or N) :");
		char acMachine = scanner.next().charAt(0);
		Room room = new Room();
		room.setData(roomNo, roomType, roomArea, acMachine);
		room.display();
		scanner.close();
	}

}
