package program4;

import java.util.Scanner;

public class MainCricket {

	public static void main(String[] args) {
		int runs = 0;
		int overs = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter runs and overs : ");
		try{
			if(scanner.hasNextInt()){
			 runs = scanner.nextInt();
			}
			else{
				throw new NumberFormatException();
			}
			if(scanner.hasNextInt())
			{
			 overs = scanner.nextInt();
			}
			else{
				throw new NumberFormatException();
			}
			Cricket cricket = new Cricket();
			System.out.println(cricket.runrate(runs, overs));
		}catch(ArithmeticException  | NumberFormatException nf){
			System.out.println(nf.toString());
		}
		
		
	}

}
