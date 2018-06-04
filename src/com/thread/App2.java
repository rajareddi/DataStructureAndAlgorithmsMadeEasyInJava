/*Copyright (c) 01-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: App2.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.thread;

import java.util.Scanner;

class Processor extends Thread {
	boolean running = true;

	@Override
	public void run() {

		while (running) {
			System.out.println("Hi from thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class App2 {
	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		proc1.running = false;
		System.out.println("Done");
	}

}
