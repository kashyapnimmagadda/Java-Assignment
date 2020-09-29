package program2;

public class DemoThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Running child Thread in Loop : ");
		for (int i = 0; i < 11; i++) {
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		DemoThread1 t1 = new DemoThread1();
		DemoThread1 t2 = new DemoThread1();
		DemoThread1 t3 = new DemoThread1();
		//Thread t1 = new Thread(demoThread);
		//Thread t2 = new Thread(demoThread);
		//Thread t3 = new Thread(demoThread);
		t1.start();
		t2.start();
		t3.start();
	}
}