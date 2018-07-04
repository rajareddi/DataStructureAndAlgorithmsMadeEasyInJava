package com.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class TheadWithTestArray {

	static int i = 0;

	public static void main(String[] args) {

		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i] = i;
		}
		for (Integer integer : list) {
			System.out.println(integer.intValue());
		}

		Thread t = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < list.length; i++) {
					if (i % 2 == 0) {
						System.out.println("FIRST REMOVED " + list[i] + (list[i] = 0));
					}
				}
			}
		};
		t.setName("FIRST");
		t.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < list.length; i++) {
					if (i % 2 != 0) {
						System.out.println("SECOUND REMOVED " + list[i] + (list[i] = 0));
					}
				}
			}
		};
		t2.setName("Second");
		t2.start();

	}

}
