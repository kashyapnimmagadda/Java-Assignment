package day2;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EnterDetails details = new EnterDetails();
		details.addDetails();
		Student student1 = new Student(details.age, details.firstName,details.lastName, details.age, details.gender,details.subMarks, details.subMajor);

		System.out.println("Enter Student 2 Details");
		EnterDetails details1 = new EnterDetails();
		details1.addDetails();
		Student student2 = new Student(details1.age, details1.firstName,details1.lastName, details1.age, details1.gender,details1.subMarks, details1.subMajor);
		System.out.println("enter 1 to choose student 1 ");
		System.out.println("enter 2 to choose student 2 ");
		System.out.println("enter 3 to search student by name ");
		System.out.println("enter 4 to search student by Id ");
		System.out.println("enter 5 to search student whose major is ece ");
		System.out.println("enter 6 to quit ");
		int choice= scan.nextInt();
		boolean flag=true;
		while(flag){
		switch(choice){
		case 1:
		{
			System.out.println("enter 1 to choose student 1 total details"+"\n"+"enter 2 to choose student 1 full name"+"\n"+"enter 3 to choose student 1 total marks nd average marks"+"\n"+"enter 4 to quit");
			int stu1 = scan.nextInt();
		  while(flag){
			switch(stu1){
			case 1:{
				student1.totalDetails(student1);
				flag=false;
				break;
			}
			case 2:
			{
				System.out.println("Full Name : " + "\n" + student1.fullName());
				flag=false;
				break;
			}
			case 3:
			{
				System.out.println("Total Marks of " + student1.getFirstName() + " "+ student1.totalMarks());
				System.out.println("Average of " + student1.getFirstName() + " "+ student1.average());
				flag=false;
                break;
			}
			}
			}
			break;
		}
		case 2:
		{
			System.out.println("enter 1 to choose student 2 total details"+"\n"+"enter 2 to choose student 2 full name"+"\n"+"enter 3 to choose student 2 total marks nd average marks"+"\n"+"enter 4 to quit");
			int stu2 = scan.nextInt();
			boolean count=true;
			while(count){
			switch(stu2){
			case 1:{
				student2.totalDetails(student2);
				count=false;
				break;
			}
			case 2:
			{
				System.out.println("Full Name : " + "\n" + student2.fullName());
				count=false;
				break;
			}
			case 3:
			{
				System.out.println("Total Marks of " + student2.getFirstName() + " "+ student2.totalMarks());
				System.out.println("Average of " + student2.getFirstName() + " "+ student2.average());
				count=false;
                break;
			}
			}
			}
			break;
		}
		case 3:
		{
			 System.out.println("\n\n Enter a name to search");
			    String name = scan.next();
				student2.searchByName(student1, student2,name);
				flag=false;
				break;
		}
		case 4:{
			System.out.println("\n\n Enter a Id to search");
			int id = scan.nextInt();
			student2.searchById(student1, student2, id);
			flag=false;
			break;
		}
		case 5:
			student2.isMajor(student1, student2);
			flag=false;
			break;
		}
		
		}

	}
}
