/*Copyright (c) 12-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: FibonacciHacker.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.util.Scanner;

public class FibonacciHacker {

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return n + fibonacci(n - 1);

	}

	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();*/
	//	System.out.println(fibonacci(n));
		System.out.println(7%5);

	}

}