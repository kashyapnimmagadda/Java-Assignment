package day2;

import java.util.Scanner;

public class EnterDetails {
	int id;
	String firstName;
	String lastName;
	int age;
	String gender;
	int subjectNumber;
	int[] subMarks = new int[2];
	String subMajor;

	public void addDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		this.id = scan.nextInt();
		System.out.println("Enter First Name");
		this.firstName = scan.next();
		System.out.println("Enter Last Name");
		this.lastName = scan.next();

		System.out.println("Enter Age");
		this.age = scan.nextInt();
		System.out.println("Enter Gender");
		this.gender = scan.next();
		System.out.println("Enter no.of Subjects");
		subjectNumber = scan.nextInt();
		int[] Marks = new int[subjectNumber];
		System.out.println("Enter Marks of " + subjectNumber + " Subjects");
		for (int i = 0; i < Marks.length; i++) {
			Marks[i] = scan.nextInt();
		}
		subMarks = Marks;
		System.out.println("Enter Subject Major");
		this.subMajor = scan.next();
		
	}
}
