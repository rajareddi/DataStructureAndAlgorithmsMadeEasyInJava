/*Copyright (c) 01-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: AppLockWorker.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppLockWorker {

	Random random = new Random(100);
	Object lock1 = new Object();
	Object lock2 = new Object();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();

	private void stagOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		list1.add(random.nextInt());

	}

	private void stagTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		list2.add(random.nextInt());

	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stagOne();
			stagTwo();
		}

	}

	public void main() {

		System.out.println("Starting ......");
		long start = System.currentTimeMillis();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		t.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		t2.start();

		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Lsit siz 1 " + list1.size() + "  size 2 " + list2.size());

		System.out.println("Total Time " + (end - start));
	}

}
