package mapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// EXAMPLE PROGRAM USING STREAM INTERMEDIATE MAP AND TERMINAL COLLECT OPERATIONS
public class MapSteam {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Robert", 1982, "New York"));
		empList.add(new Employee(2, "Chris", 1987, "Washington"));
		empList.add(new Employee(3, "Tom", 1998, "Argentina"));
		empList.add(new Employee(4, "Holland", 1995, "Australia"));
		empList.add(new Employee(5, "Prat", 1993, "England"));
		empList.add(new Employee(6, "Hemsworth", 1990, "Australia"));
		empList.add(new Employee(7, "Mark", 1989, "Amsterdam"));
		empList.add(new Employee(8, "Natasha", 1999, "New York"));

		System.out.println("Age : "+empList.stream()
				                  
								  .filter(x->x.empId>3)
				                 .map(x -> 2020 - x.empDOBYear)
				                  .collect(Collectors.toList()));
	}
}