
package com.thread;

class Runner implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("ID" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		Thread t = new Thread(runner);
		t.start();
		Thread t2 = new Thread(runner);
		t2.start();

	}

}
