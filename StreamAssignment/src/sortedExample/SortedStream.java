package sortedExample;

import java.util.ArrayList;
import java.util.List;

public class SortedStream {
	public static void main(String[] args) {
		List<price> priceList = new ArrayList<>();
		priceList.add(new price("Mobile", 45000));
		priceList.add(new price("wallet", 450));
		priceList.add(new price("pants", 605));
		priceList.add(new price("brush", 45));
		priceList.add(new price("paste", 69));
		priceList.add(new price("shirt", 450));
		priceList.add(new price("belt", 743));
		priceList.add(new price("T-shirts", 597));

		System.out.println("Sorted order of items : ");
		priceList.stream()
		         .map(p -> p.getProductPrice())
		         .sorted()
				 .forEach(p -> System.out.println(p));
	}
}
