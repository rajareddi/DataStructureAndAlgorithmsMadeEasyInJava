/*Copyright (c) 24-May-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: HashCode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

public class HashCode {
	public static void main(String[] args) {
		String str = "raja";
		int hash = 0;
		for (char ch : str.toCharArray()) {
			hash = 31 * hash + ch;
		}
		System.out.println(hash);
	}
}
