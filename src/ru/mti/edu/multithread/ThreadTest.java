package ru.mti.edu.multithread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		switch (thread.getState()){
			case RUNNABLE : System.out.println("Program is running"); break;
			case TERMINATED : System.out.println("Thread is completed"); break;
		}
		
		CustomThread custom = new CustomThread();
		custom.start();
		try {
			custom.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread customThread = new Thread(
				() -> {System.out.println("Runnable thread prints now!");});
		customThread.start();
		
		System.out.println(thread.getName());
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Main thread prints now");
	}

}
