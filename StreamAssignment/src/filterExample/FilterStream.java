package filterExample;

import java.util.ArrayList;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {

		List<School> schoolList = new ArrayList<>();
		schoolList.add(new School(1, "FirstStudent", 95));
		schoolList.add(new School(2, "SecondStudent", 85));
		schoolList.add(new School(3, "ThirdStudent", 92));
		schoolList.add(new School(4, "FourthStudent", 75));
		schoolList.add(new School(5, "FifthStudent", 81));
		schoolList.add(new School(6, "SixthStudent", 91));

		schoolList
				.stream()
				.filter(p -> p.getTotalMarks() > 85)
				.forEach(
						p -> System.out.println("NAME : " + p.getStuName()
								+ " MARKS : " + p.getTotalMarks()));
	}

}
