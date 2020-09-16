package program5;
/*
 * 5.	Accept a string, and two indices(integers), and 
 * print the substring consisting of all characters inclusive range from ..to . 
 */
public class SubString {
	public String editString(String string, int number1,int number2){
		String result =null;
		if(number1>0 && number2<string.length()){
		 result = string.substring(number1,number2);
		
		}
		else{
			 result ="Enter a valid number";
		}
		return result;
	}

}
