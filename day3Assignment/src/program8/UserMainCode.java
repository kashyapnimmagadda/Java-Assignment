package program8;
/*
 * 8.	Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 characters except when
a.	Keep the first char if it is 'k'
b.	Keep the second char if it is 'b'.

 */
public class UserMainCode {
	public static String getString(String string){
		String result="";
		char[] letters = string.toCharArray();
		if(letters[0]!='k'&&letters[1]!='b'){
			letters[0]='0';
			letters[1]='0';
		}
		else if(letters[1]!='b'){
			letters[1]='0';
		}
		else if(letters[0]!='k'){
			letters[0]='0';
		}

		System.out.println(letters[0]+""+letters[1]);
		if(letters[0]=='0'&&letters[1]=='0'){
			for(int i=2;i<string.length();i++){
				result=result+letters[i];
			}
		}
		else if(letters[0]!='0' && letters[1]=='0'){
			result=""+letters[0];
			for(int i=2;i<string.length();i++){
				result=result+letters[i];
			}
		}
		else if(letters[0]=='0'&&letters[1]!='0'){
			for(int i=1;i<string.length();i++){
				result=result+letters[i];
			}
		}
		else{
			for(int i=0;i<string.length();i++){
				result=result+letters[i];
			}
		}

		return result;
	}

}
