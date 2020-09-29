package program4;

public class Number implements Runnable {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("Beggining " + Thread.currentThread().getName());
		for (int i = 1; i < 11; i++) {
			int result = number * i;
			System.out.println(result);
		}
		System.out.println("Completed " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Number number2 = new Number(2);
		Number number5 = new Number(5);
		Number number8 = new Number(8);
		Thread t1 = new Thread(number2);
		Thread t2 = new Thread(number5);
		Thread t3 = new Thread(number8);
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
