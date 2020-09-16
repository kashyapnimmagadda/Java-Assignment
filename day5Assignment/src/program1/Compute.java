package program1;

public class Compute {
	public int divide(int number1, int number2)throws ArithmeticException {
		int result = 0;
			if (number2 == 0) {
				throw new ArithmeticException();
			}
			else{
				result = number1/number2;
			}
		return result;
	}
}
