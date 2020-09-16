package program2;
/*
 * Write a Java method to display the middle character of a string. 
 a) If the length of the string is odd there will be two middle characters.
 b) If the length of the string is even there will be one middle character.
  Input a string: 367 
 Expected Output:                                                                    
The middle character in the string: 6

 */
public class MiddleCharecter {
	public char[] middle(String string){
		char[] result = new char[2];
		char[] letters = new char[string.length()];
		for(int i=0;i<string.length();i++){
			letters[i]=string.charAt(i);
		}
		if(string.length()%2==0){
			result[0]=letters[(string.length()/2)-1];
			result[1]=letters[(string.length()/2)];
		}
		else{
			result[0]=letters[(string.length()-1)/2];
		}
		return result;
	}
}
