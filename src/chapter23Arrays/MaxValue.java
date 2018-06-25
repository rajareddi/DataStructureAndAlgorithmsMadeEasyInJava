/*Copyright (c) 06-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MaxValue.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter23Arrays;

public class MaxValue {

	public static void main(String[] args) {
		// |Ai - Aj| + |i - j|

		int[] input = { 1, 1, 1 };
		int max = getmax(input);
		System.out.println(max);

	}

	private static int getmax(int[] A) {
		int max = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {
				int data = Math.abs(A[i] - A[j]) + Math.abs(i - j);
				if (data >= max) {
					max = data;
				}
			}

		}
		return max;
	}

}
