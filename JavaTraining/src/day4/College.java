package day4;

public class College {
	String collegeName;
	int collegeRank;
	String collegeDean;
	Department[] department;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeRank() {
		return collegeRank;
	}

	public void setCollegeRank(int collegeRank) {
		this.collegeRank = collegeRank;
	}

	public String getCollegeDean() {
		return collegeDean;
	}

	public void setCollegeDean(String collegeDean) {
		this.collegeDean = collegeDean;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}

	public College(String collegeName, int collegeRank, String collegeDean,
			Department[] department) {
		super();
		this.collegeName = collegeName;
		this.collegeRank = collegeRank;
		this.collegeDean = collegeDean;
		this.department = department;
	}

}
