package program7;
//Write a program to find the given string is pangram or not.
//(Hint: Pangrams are words or sentences containing every letter of the alphabet at least once)

public class Pangram {
	public int pangramString(String string) {
		char[] letters = new char[string.length()];
		letters = string.toCharArray();
		int flag = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 65; j < 123; j++) {
				if (letters[i] == (char) j) {
					flag++;
				}
			}
		}
		return flag;
	}

}
