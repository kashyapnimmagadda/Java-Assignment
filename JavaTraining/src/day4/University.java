package day4;

public class University {
	String universityName;
	String universityHead;

	public University(String universityName, String universityHead,
			int universityColleges, College[] college) {
		super();
		this.universityName = universityName;
		this.universityHead = universityHead;
		this.universityColleges = universityColleges;
		this.college = college;
	}

	int universityColleges;
	College[] college;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityHead() {
		return universityHead;
	}

	public void setUniversityHead(String universityHead) {
		this.universityHead = universityHead;
	}

	public int getUniversityColleges() {
		return universityColleges;
	}

	public void setUniversityColleges(int universityColleges) {
		this.universityColleges = universityColleges;
	}

	public College[] getCollege() {
		return college;
	}

	public void setCollege(College[] college) {
		this.college = college;
	}

}
