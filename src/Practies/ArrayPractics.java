/*Copyright (c) 29-May-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ArrayPractics.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.util.Arrays;

public class ArrayPractics {
	public int i = 10;

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };

		System.out.println(Arrays.stream(array));

		ArrayPractics arrayPractics = new ArrayPractics();
		arrayPractics.i = 20;
		try {
			Object obj = arrayPractics.clone();
			System.out.println(obj.getClass());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void show() {
		System.out.println("HI show my class");
	}
}
