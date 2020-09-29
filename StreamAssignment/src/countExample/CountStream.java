package countExample;

import java.util.ArrayList;
import java.util.List;

public class CountStream {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(102);
		numbers.add(102);
		numbers.add(10);
		numbers.add(1034);
		numbers.add(1243);
		numbers.add(654);
		numbers.add(235);
		numbers.add(53);
		numbers.add(6756);
		
	long distunctNumbers=	numbers.stream()
		                           .distinct()
		                           .filter(p->p>100)
		                           .count();
	System.out.println("NO OF DISTINCT NUMBERS GREATER THAN 100 IN THE LIST : "+distunctNumbers);
		
	}

}
