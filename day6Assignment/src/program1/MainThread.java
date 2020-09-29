package program1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainThread extends Thread {
	public void run() {
		System.out.println("Sleeping for 10 seconds");
	}

	public static void main(String[] args) {
		MainThread t1 = new MainThread();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(dtf.format(LocalDateTime.now()));
		
		t1.start();
		System.out.println("Current thread name : " + t1.getName());
		t1.setName("MyThread");
		System.out.println("Updated thread name : " + t1.getName());
		try {
			t1.sleep(10000);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println(dtf.format(LocalDateTime.now()));
	}

}
