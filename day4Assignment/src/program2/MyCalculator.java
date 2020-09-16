package program2;

public class MyCalculator implements AdvanceArithmetic {
	public int divisorSum(int num) {
		int sum = 0;
		if (num <= 1000) {
			for (int i = 1; i <= (num /2); i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
		}
	
		return sum+num;
	}
}
