package day5;

import java.util.Scanner;

public class MainFrequency {

	public static void main(String[] args) {
		StringFrequency stringfrequency = new StringFrequency();
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter 1 to find the frequency of all letters"+"\n"+"Enter 2 to find the frequency of a character");
		int choice = scan.nextInt();
		switch(choice){
		
		case 1:{
			System.out.println("Enter a string :");
		String name = scan.next();
		int[] repeatednumber = stringfrequency.frequency(name);
		char[] namechar = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (namechar[i] == namechar[j]) {
					namechar[j] = '0';
				}
			}
		}
		for (int i = 0; i < repeatednumber.length; i++) {
			if (namechar[i] != '0') {
				System.out.println(namechar[i] + "-" + repeatednumber[i]);
			}
		}
		break;
		}
		case 2 :
		{
			System.out.println("Enter a string :");
			String userString = scan.next();
			System.out.println("Enter a charecter");
			char userCharecter = scan.next().charAt(0);
			int count = stringfrequency.charfrequency(userString, userCharecter);
			System.out.println("Frequency of "+"'"+userCharecter+"'" +" in the given string is : "+count);
			break;
		
	  }
	}
}
}
