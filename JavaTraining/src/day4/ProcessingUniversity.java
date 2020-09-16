package day4;

public class ProcessingUniversity {
	public String[] processing(University[] universities) {
		String[] list = new String[3];
		Department[] depart = new Department[3];
		College[] colleges = new College[5];
		int i = 0;
		for (University univ : universities) {
			colleges = univ.getCollege();
			for (College colg : colleges) {
				depart = colg.getDepartment();
				for (Department dept : depart) {
					if (dept.getDepartmentName().equals("ece")) {
						list[i] = colg.getCollegeName();
						i++;
					}
				}
			}
		}
		return list;
	}
}
