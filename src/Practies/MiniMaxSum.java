/*Copyright (c) 26-Mar-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MiniMaxSum.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	/*
	 * Complete the miniMaxSum function below.
	 */
	static void miniMaxSum(int[] arr) {
		int n = arr.length;
		int valueI = 0;
		long max = 0;
		long min = 0;
		Arrays.sort(arr);
		for (int j = 0; j < n-1; j++) {

			min =min+  arr[j+1];
			max=max+arr[j];
		}

		System.out.println(min + "\t" + max );
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		miniMaxSum(arr);
	}
}
