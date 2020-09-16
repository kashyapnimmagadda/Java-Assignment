package program3;
/*
 * Write a Java method to count all vowels in a string. 
Input the string: Hcl Technologies 
 Expected Output:
Number of  Vowels in the string: 5

 */
public class CountVowels {
	public int vowelsCount(String string){
		int count=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'||string.charAt(i)=='A'||string.charAt(i)=='E'||string.charAt(i)=='I'||string.charAt(i)=='O'||string.charAt(i)=='U'){
				count++;
			}
		}
		return count;
	}

}
