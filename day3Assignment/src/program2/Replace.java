package program2;
//2.	Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.
public class Replace {
	public char[] replaceh(String string){
		char[] letters=string.toCharArray();
		for(int i=0;i<string.length();i++){
			if(letters[i]=='d'){
				letters[i]='h';
			}
		}
		return letters;
	}

}
