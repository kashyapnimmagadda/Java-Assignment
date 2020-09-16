package day2;

public class Student {
	private int studentNumber;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int[] marks;
	private String major;

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	Student(int studentNumber, String firstName, String lastName, int age,
			String gender, int[] marks, String major) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.major = major;
	}

	public String fullName() {
		return (firstName + " " + lastName);
	}

	public String isMale(String gender) {
		if (gender == "M" || gender=="m"||gender=="male"||gender=="Male"||gender=="MALE") {
			return "The Gender of the Student is Male";
		} else
			return "The Gender of the Student is Female";
	}

	public int totalMarks() {
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		return total;
	}

	public int average() {
		return (totalMarks() / marks.length);
		
	}

	public void totalDetails(Student student) {
		System.out.println("Total Details :"+"\n"+"studentNumber :" + student.studentNumber
				+ " Name :" + student.fullName() + " Age :" + student.age
				+ " Gender :" + student.gender);
		return;
	}

	public void searchByName(Student student, Student student1, String name) {
		if (student.firstName.equals(name)) {
			System.out.println(student.firstName + student.lastName
					+ student.age);
		} else if (student1.firstName.equals(name)) {
			System.out.println(student1.firstName + student1.lastName
					+ student1.age);
			System.out.println("\n");
		}
		else{
			System.out.println("\n");
			System.out.println("Not FOUND");
		}
		return;
	}

	public void searchById(Student student, Student student1, int id) {
		if (student.studentNumber == id) {
			System.out.println("Id Number " + student.studentNumber + " "
					+ student.firstName + student.lastName + " Age is "
					+ student.age);
		} else if (student1.studentNumber == id) {
			System.out.println("Id Number " + student1.studentNumber + " "
					+ student1.firstName + student1.lastName + " Age is "
					+ student1.age);
			System.out.println("\n");
		}
		else{
			System.out.println("Not FOUND!!!");
		}
		return;
	}

	public void isMajor(Student student1, Student student2) {
		if (student1.major == "CSE") {
			System.out.println(student1.firstName + student1.lastName + " "
					+ student1.age + " Major is CSE");
		} else {
			System.out.println(student2.firstName + student2.lastName + " "
					+ student2.age + " Major is ECE");
		}
		return;
	}

}
