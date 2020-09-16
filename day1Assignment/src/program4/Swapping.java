package program4;
//Write a Java program to swap two variables.
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to be swapped : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        int temp= number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping:"+"\n"+"First number : "+number1+"\n"+"Second number : "+number2);
        scan.close();
	}

}
