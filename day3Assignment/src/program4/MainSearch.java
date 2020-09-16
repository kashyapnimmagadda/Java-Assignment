package program4;

import java.util.Scanner;

public class MainSearch {

	public static void main(String[] args) {
		System.out.println("Enter no of elements in the array : ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<length;i++){
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the number to search in the array : ");
		int element = scanner.nextInt();
		Search search = new Search();
		int result =search.searching(array, element);
		if(result>0){
			System.out.println(element+" is found");
		}
		else
		{
			System.out.println(element+" is not found");
		}
		scanner.close();
	}

}
