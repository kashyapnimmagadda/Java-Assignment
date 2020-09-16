package program3;

public class Eligible {
	private String name;
	private int age;
	public boolean ipl(String name, int age)throws CustomException{
		boolean result = false;
		if(age<19){
			throw new CustomException("Invalid Age Range Exception");
		}
		else{
			this.name=name;
			this.age=age;
			result = true;
		}
		return result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
