package filterExample;

public class School {
	private int stuID;
	private String stuName;
	private int totalMarks;
	public School(){
		super();
	}
	public School(int stuID, String stuName, int totalMarks) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.totalMarks = totalMarks;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

}
