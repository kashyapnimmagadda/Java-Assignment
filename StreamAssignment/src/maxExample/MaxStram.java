package maxExample;

import java.util.ArrayList;
import java.util.List;

public class MaxStram {

	public static void main(String[] args) {
		List<Balnce>  balnceList = new ArrayList<>();
		balnceList.add(new Balnce( "One", 49500));
		balnceList.add(new Balnce( "Two", 34485));
		balnceList.add(new Balnce( "Three",65392));
		balnceList.add(new Balnce( "Four", 76575));
		balnceList.add(new Balnce("Five", 85481));
		balnceList.add(new Balnce( "Six", 48891));
		balnceList.add(new Balnce( "Seven", 64932));
		balnceList.add(new Balnce( "Eight", 98794));
		Balnce largeBalnce =  balnceList
				.stream()
				.max((x,y)->x.getBalance()>y.getBalance()?1:-1)
				.get();
		System.out.println("Highest Balance : "+largeBalnce.getBalance());
		Balnce lowBalnce =  balnceList
				.stream()
				.min((x,y)->x.getBalance()<y.getBalance()?-1:1)
				.get();
		System.out.println("lowest Balance : "+lowBalnce.getBalance());
	}
}
