package program7;
/*
 * Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz".
Ex :	3 : fizz                                                                
5 : buzz                                                                
6 : fizz                                                                
9 : fizz                                                                
10	: buzz

 */
public class MainFizz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+" fizz buzz");
			} else if (i % 3 == 0) {
				System.out.println(i+" fizz");
			} else if (i % 5 == 0) {
				System.out.println(i+" buzz");
			}
		}
	}
}
