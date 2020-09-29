package limitExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import maxExample.Balnce;

public class LimitStream {

	public static void main(String[] args) {
		List<Balnce> balnceList = new ArrayList<>();
		balnceList.add(new Balnce("One", 49500));
		balnceList.add(new Balnce("Two", 34485));
		balnceList.add(new Balnce("Three", 65392));
		balnceList.add(new Balnce("Four", 76575));
		balnceList.add(new Balnce("Five", 85481));
		balnceList.add(new Balnce("Six", 48891));
		balnceList.add(new Balnce("Seven", 64932));
		balnceList.add(new Balnce("Eight", 98794));
		System.out.println(balnceList.stream().map(p -> p.getBalance())
				.sorted().limit(5).collect(Collectors.toList()));
	}

}
