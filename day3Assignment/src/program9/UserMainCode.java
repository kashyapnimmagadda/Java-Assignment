package program9;
/*
 * 9.	Write a program to read a string and a character, and reverse the string and convert it in a format such that
 *  each character is separated by the given character. Print the final string
 *Sample Input:
                Rabbit
                -
              Sample Output:
                  t-i-b-b-a-R

 */
public class UserMainCode {
	public String stringEdit(String string , char charecter){
		char[] letters = string.toCharArray();
		String reverse = "";
		for(int i=string.length()-1;i>=0;i--){
			reverse= reverse+letters[i];
		}
		char[] alphabets = reverse.toCharArray();
		String updated =""+alphabets[0]+charecter;
		for(int i=1;i<string.length()-1;i++){
			updated=updated+alphabets[i]+charecter;
		}
		updated=updated+alphabets[string.length()-1];
		return updated;
	}

}
