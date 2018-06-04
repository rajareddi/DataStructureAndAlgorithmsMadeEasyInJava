/*Copyright (c) 01-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Producer_Consumer.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.thread;

public class Producer_Consumer {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		Producer pc = new Producer(intArray);

	}

}

class Producer {

	public Producer(int[] intArray) {
		while (true) {
			if (intArray.length == 0) {
				for (int i = 0; i < intArray.length; i++) {
					intArray[i] = i;

				}
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}

class Consumer {

}