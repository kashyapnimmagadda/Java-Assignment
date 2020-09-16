package program2;

public class Calculator {
	public long power(int number1, int number2)throws Exception {
		int result=1;
			if (number1 == 0 && number2 == 0) {
				throw new Exception("Both numbers should not be zero");
			} else if (number1 < 0 || number2 < 0) {
				throw new Exception("Numbers should not be negative");
			}
			else 
			{
				for(int i=1;i<number2;i++){
					result=result*number1;
				}
			}
		return result;
	}

}
