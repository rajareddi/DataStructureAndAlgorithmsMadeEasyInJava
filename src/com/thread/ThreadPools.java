/*Copyright (c) 01-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ThreadPools.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Processer implements Runnable {
	private int id;

	public Processer(int id) {
		this.id = id;
	}

	/**
	 * //https://dzone.com/articles/threads-top-80-interview
	 */
	@Override
	public void run() {

		System.out.println("starting id " + id);
		try {
			if (id % 2 == 0) {
				throw new Exception("Exception while processing the data {}" + id);
			}
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ending id " + id);

	}
}

public class ThreadPools {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(1);
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Future result = executor.submit(new Processer(i));
			list.add(result);
		}
		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(" result " + list.get(i).toString());
		}

	}

}
