package program3;

public class DemoThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Running child Thread in Loop : ");
		for (int i = 0; i < 11; i++) {
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		DemoThread2 demoThread = new DemoThread2();
		Thread t1 = new Thread(demoThread);
		Thread t2 = new Thread(demoThread);
		Thread t3 = new Thread(demoThread);
		t1.start();
		t2.start();
		t3.start();
	}
}
