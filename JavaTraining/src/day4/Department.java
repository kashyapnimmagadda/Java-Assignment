package day4;

public class Department {
	String departmentName;
	String departmentHead;
	int departmentTotalStaff;
	int studentsNumber;

	public int getStudentsNumber() {
		return studentsNumber;
	}

	public void setStudentsNumber(int studentsNumber) {
		this.studentsNumber = studentsNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	public int getDepartmentTotalStaff() {
		return departmentTotalStaff;
	}

	public void setDepartmentTotalStaff(int departmentTotalStaff) {
		this.departmentTotalStaff = departmentTotalStaff;
	}

	public Department(String departmentName, String departmentHead,
			int departmentTotalStaff, int studentsNumber) {
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.departmentTotalStaff = departmentTotalStaff;
		this.studentsNumber = studentsNumber;
	}

}
