package program1;
//Write a Java method to find the smallest number among three numbers.
public class SmallestNumber {
	public int small(int[] number) {
		int small = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < small) {
				small = number[i];
			}
		}
		return small;
	}

}
