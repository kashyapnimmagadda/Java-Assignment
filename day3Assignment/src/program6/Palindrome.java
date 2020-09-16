package program6;
//6.	Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise. 
public class Palindrome {
	public int isPalindrome(String string){
		int flag=0;
		char[] letters = string.toCharArray();
		String reverse = "";
		for(int i=string.length()-1;i>=0;i--){
			reverse=reverse+letters[i];
		}
		System.out.println(reverse);
		if(string.equalsIgnoreCase(reverse)){
			flag=1;
		}
		else{
			flag=0;
		}
		return flag;
	}

}
