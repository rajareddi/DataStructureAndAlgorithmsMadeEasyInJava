/*Copyright (c) 28-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Test.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		// Two();

		int[] array = { 5, 1, 3, 4, 6, 2 };

		one(array);
	}

	static void finalPrice(int[] prices) {

		int totalDiscount = 0;
		List list = new ArrayList();
		for (int i = 0; i < prices.length; i++) {
			int index = prices[i];
			int minInd = i;
			for (int j = i + 1; j < prices.length; j++) {
				if (index > prices[j]) {
					minInd = j;
					break;

				}

			}
			if (index == minInd) {
				totalDiscount = totalDiscount + prices[i];
			} else {
				System.out.println((prices[i] - prices[minInd]));
				totalDiscount = totalDiscount + (prices[i] - prices[minInd]);
			}
			if ((prices[i] - prices[minInd]) == 0) {
				list.add(minInd);
			}
		}
		System.out.println("totalDiscount" + totalDiscount);
		System.out.println(list);

	}

	private static void one(int[] prices) {
		int totalDiscount = 0;
		List list = new ArrayList();
		for (int i = 0; i < prices.length; i++) {
			int index = prices[i];
			int minInd = i;
			for (int j = i + 1; j < prices.length; j++) {
				if (index >= prices[j]) {
					minInd = j;
					break;

				}

			}
			if (i == minInd) {
				totalDiscount = totalDiscount + prices[i];
			} else {
				System.out.println((prices[i] - prices[minInd]));
				totalDiscount = totalDiscount + (prices[i] - prices[minInd]);
			}
			if ((prices[i] - prices[minInd]) == 0) {
				list.add(minInd);
			}
		}
		System.out.println(totalDiscount);

		System.out.println(list);
	}

	private static void Two() {
		String regex = "((//[^\n\r]*)|(/\\*(.+?)\\*/))";
		List<String> comments = new ArrayList<String>();
		Pattern p = Pattern.compile(regex, Pattern.DOTALL);
		String code = null;
		Matcher m = p.matcher(code);
		while (m.find()) {
			System.out.println(m.group(1));
			comments.add(m.group(1));
		}
	}

}
