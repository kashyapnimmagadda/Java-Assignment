package program3;

import java.util.Scanner;

public class MainEligible {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name and age : ");
		String name = scanner.next();
		int age = scanner.nextInt();
		Eligible eligible = new Eligible();
		try{
		boolean result = eligible.ipl(name, age);
		if(result){
			System.out.println("Name : "+eligible.getName());
			System.out.println("Age : "+eligible.getAge());
		}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
