/*Copyright (c) 19-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: TIme.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {

		// 12:40:22AM
		String[] out = s.split(":");
		int out1 = Integer.parseInt(out[0]);
		if (s.contains("PM")) {
			int d = out1 + 12;
			if (d == 24) {
				d = 12;
			}
			s = s.replace(out[0], String.valueOf(d));
		}
		if (s.contains("AM")) {
			String d = "00";
			if (out1 == 12) {
				d = "00";
				s = s.replace(out[0], String.valueOf(d));
			}

		}

		s = s.replace("PM", "");
		s = s.replace("AM", "");
		return s;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"D:\\devhome\\Raja\\DataStructures and Algarithams\\DataStructureAndAlgorithmsMadeEasyInJava\\raja.txt"));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
