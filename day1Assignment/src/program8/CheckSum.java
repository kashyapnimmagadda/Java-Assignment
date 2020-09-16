package program8;

public class CheckSum {
	int flag;
	int sum = 0;
	int count = 0;

	public int digits(int number) {
		int temp = number;
		while (number != 0) {
			number = number / 10;
			count++;
		}

		int[] digitsArray = new int[count];
		int j = 0;
		while (temp != 0) {
			digitsArray[j] = temp % 10;
			temp = temp / 10;
			j++;
		}
		if (count % 2 == 0) {
			for (int i = 1; i < count; i = i + 2) {
				sum = sum + digitsArray[i];
			}
		} else {
			for (int i = 0; i < count; i = i + 2) {

				sum = sum + digitsArray[i];
			}
		}
		System.out.println(sum);
		if (sum % 2 == 0) {
			flag = 0;
		} else {
			flag = 1;
		}
		return flag;
	}
}