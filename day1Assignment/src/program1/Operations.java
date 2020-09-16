package program1;
/* 
 * 1.	Write a Java program to print the result of the following operations. 
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
*/
public class Operations {

	public static void main(String[] args) {
		int testOperators = -5+8*6;
		int testModulus = (55+9)%9;
		int testDivision = 20+-3*5/8;
		int testAllOperators = 	5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("Answers :");
		System.out.println("1. "+testOperators+"\n2. "+testModulus+"\n3. "+testDivision+"\n4. "+testAllOperators);;
	}

}
