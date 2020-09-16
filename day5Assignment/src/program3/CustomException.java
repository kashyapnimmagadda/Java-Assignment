package program3;

public class CustomException extends Exception {
	String result = null;
	public CustomException(String string){
		result=string;
	}
	public String toString(){
		return result;
	}
}
