package program5;
/*
 * Write a java program, which will take a number variable and check whether the number is prime or not.
Note:  Prime number is a number that is greater than 1 and divided by 1 or itself only. For example, 2, 3, 5, 7, 11, 13, 17.... are the prime numbers

 */
public class PrimeNumber {
	public int isprime(int number) {
		int count = 0;
		if (number < 0) {
			System.out.println("Enter a valid number");
		} else if (number == 1 || number==0) {
			count=1;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
				}
			}
		}
		return count;
	}

}