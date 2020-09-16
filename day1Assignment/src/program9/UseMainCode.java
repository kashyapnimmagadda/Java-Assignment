package program9;

public class UseMainCode {
	public static int sumOfSquaresOfEvenDigits(int number){
		int count=0;
		int sum=0;
		int temp = number;
		int j=0;
		while(number!=0){
			number=number/10;
			count++;
		}
		int[] digitArray = new int[count];
		while(temp!=0){
			digitArray[j]=temp%10;
			temp=temp/10;
			j++;
		}
		if(count%2==0){
			for(int i=0;i<count;i=i+2){
				int digit=digitArray[i]*digitArray[i];
				sum=sum+digit;
			}
		}
		else{
			for(int i=1;i<count;i=i+2){
				int digit=digitArray[i]*digitArray[i];
				sum=sum+digit;
			}
		}
		return sum;
	}

}
