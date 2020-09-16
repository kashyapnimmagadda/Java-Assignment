package day3;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 array elements : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Enter"+"\n"+"1 for Ascending Order"+"\n"+"2 for Decending order");
		int choice= scan.nextInt();
		switch(choice)
		{
		case 1:{
		Arraydemo ad = new Arraydemo();
		int[] result = ad.sorting(array);
		for (int as : result) {
			System.out.println(as);
		}
		break;
		}
		case 2:
		{
			Arraydemo ad = new Arraydemo();
			int[] result = ad.descSorting(array);
			for (int as : result) {
				System.out.println(as);
		}
			break;
		}
		}
		scan.close();
	}
}
