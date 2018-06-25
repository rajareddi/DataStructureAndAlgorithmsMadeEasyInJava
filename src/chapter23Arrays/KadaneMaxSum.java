/*Copyright (c) 04-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: KadaneMaxSum.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter23Arrays;

public class KadaneMaxSum {

	public static void main(String[] args) {

		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int output = maxSum(array);
		System.out.println(output);

	}

	
	private static int maxSum(int[] array) {

		int maxsofor=0;
		int maxumber =Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			maxsofor = maxsofor + array[i];
			if (maxumber < maxsofor) {
				maxumber = maxsofor;
			}
			if (maxsofor < 0)
				maxsofor = 0;

		}
		return maxumber;
	}
}
