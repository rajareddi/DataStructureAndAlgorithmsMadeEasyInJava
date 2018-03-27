/*Copyright (c) 27-Mar-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: StringDelete.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

public class StringDelete {

	public static void main(String[] args) {
		String str = "aaabccddd";
		StringBuilder br = new StringBuilder(str);
		br.delete(0, 1+1);
		System.out.println(br.toString());
	}
}
