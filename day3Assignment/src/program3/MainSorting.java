package program3;

import java.util.Scanner;

public class MainSorting {

	public static void main(String[] args) {
		System.out.println("Enter no of elements : ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		System.out.println("Enter the elements : ");
		int[] array = new int[length];
		for(int i=0;i<length;i++){
			array[i]=scanner.nextInt();
		}
		Sorting sorting = new Sorting();
		int[] result = sorting.arraySort(array);
		for(int i=0;i<length;i++){
			System.out.println(result[i]);
		}
		scanner.close();
	}

}
