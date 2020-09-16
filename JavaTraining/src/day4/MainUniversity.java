package day4;

public class MainUniversity {

	public static void main(String[] args) {
		
		Department department1 = new Department("electronics", "nanditha", 50, 600);
		Department department2 = new Department("computer", "rao", 30, 300);
		Department department3 = new Department("ece", "ramesh", 25, 250);
		//department
		Department[] department = new Department[2];
		department[0]=department1;
		department[1]=department2;
		//sathyabamaDepartment
		Department[] sathyabamaDepartment = new Department[3];
		sathyabamaDepartment[0]=department1;
		sathyabamaDepartment[1]=department2;
		sathyabamaDepartment[2]=department3;
		
		College college1 = new College("sathyabama", 13, "ravi", sathyabamaDepartment);
		College college3 = new College("klu", 20, "chaitanya", sathyabamaDepartment);
		College college2 = new College("siddartha", 17, "narayana", department);
		College college4 = new College("vignan", 20, "suresh", department);
		College college5 = new College("St.johns", 33, "ramesh", sathyabamaDepartment);
		//college
		College[] college = new College[2];
		college[0]=college1;
		college[1]=college2;
		//updatedCollege
		College[] updatedCollege = new College[4];
		updatedCollege[0]=college5;
		updatedCollege[1]=college2;
		updatedCollege[2]=college3;
		updatedCollege[3]=college4;
		University university1 = new University("jeppiar","johnson",50,updatedCollege);
		University university2 = new University("jntuk","india",21,college);
		//universities
		University[] universities= new University[2];
		universities[0]=university1;
		universities[1]=university2;
		//System.out.println(universities[0].college[0].department[2].getDepartmentName());
		ProcessingUniversity Process = new ProcessingUniversity();
		String[] colgNames = new String[5]; 
		colgNames=Process.processing(universities);
		for(String names : colgNames){
			System.out.println("College having Electronics Department : "+names);
		}
	}
}
