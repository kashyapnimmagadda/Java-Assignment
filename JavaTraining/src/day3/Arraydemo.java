package day3;

public class Arraydemo {
	public int[] sorting(int[] array) {
		System.out.println("Ascending order : ");
		int[] ascending = new int[5];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			ascending[i] = array[i];
		}
		return ascending;
	}
	public int[] descSorting(int[] array) {
		System.out.println("Decending order : ");
		int[] Decending = new int[5];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			Decending[i] = array[i];
		}
		return Decending;
	}

}
