package program2;

public class MainArithmeticOperations {

	public static void main(String[] args) {
		ArithmeticOperations arthmeticOperations = new ArithmeticOperations();
		System.out.println("Addtion        : "+arthmeticOperations.addittion(20, 4));
		System.out.println("Multiplication : "+arthmeticOperations.multiplication(20, 4));
		System.out.println("Subtraction    : "+arthmeticOperations.subtraction(20, 4));
		System.out.println("Division       : "+arthmeticOperations.division(20, 4));
		System.out.println("Remainder      : "+arthmeticOperations.remainder(20, 4));
	}

}
