package com.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class TheadWithTest {

	static int i = 0;

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		for (Integer integer : list) {
			System.out.println(integer.intValue());
		}

		Thread t = new Thread() {
			@Override
			public void run() {
				while (!list.isEmpty()) {
					Iterator<Integer> itr = list.iterator();
					while (itr.hasNext()) {
						Integer integer = (Integer) itr.next();
						/*itr.remove();*/list.remove(integer);
						System.out.println("REMOVED " + this.getName() + integer);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		};
		t.setName("FIRST");
		t.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (!list.isEmpty()) {
					Iterator<Integer> itr = list.iterator();
					while (itr.hasNext()) {
						Integer integer = (Integer) itr.next();
						list.remove(integer);
						System.out.println("REMOVED " + this.getName() + integer);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		};
		t2.setName("Second");
		t2.start();

	}

}
