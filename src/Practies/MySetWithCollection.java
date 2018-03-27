/*Copyright (c) 09-Mar-2016 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MySetWithCollection.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MySetWithCollection {
	

	public static void main(String a[]) {
		List<String> li = new ArrayList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("a");
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("b", 3);
		map.put("c", 8);
		map.put("d", 6);
		map.put("e", 2);
		map.put("f", 7);
		System.out.println("List: " + li);
		TreeSet<String> myset = new TreeSet<String>(li);
		System.out.println("Set: " + myset);
	}
}
