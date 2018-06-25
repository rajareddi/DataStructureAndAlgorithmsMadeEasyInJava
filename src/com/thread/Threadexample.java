
package com.thread;

import java.util.LinkedList;

public class Threadexample {
	public static void main(String[] args) {
		PC pc = new PC();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				pc.produce();
			}
		});

		t.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				pc.consume();
			}
		});

		t2.start();

		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static class PC {

		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		public void produce() {
			int value = 0;
			while (true) {
				synchronized (this) {
					while (list.size() == capacity) {
						try {
						wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					list.add(value++);
					System.out.println("Produced consumed-" + value);
					// makes the working of program easier
					// to understand
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					notify();
				}
			}

		}

		public void consume() {
			while (true) {
				synchronized (this) {
					while (list.isEmpty()) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					int val = list.removeFirst();
					System.out.println("Consumer consumed-" + val);
					notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
