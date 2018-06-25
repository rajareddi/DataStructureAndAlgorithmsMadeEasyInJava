/*Copyright (c) 20-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MakeAnagram.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MakeAnagram {

	// Complete the makeAnagram function below.
	static int makeAnagram(String str1, String str2) {

		int count1[] = new int[26];
		int count2[] = new int[26];

		for (int i = 0; i < str1.length(); i++)
			count1[str1.charAt(i) - 'a']++;

		for (int i = 0; i < str2.length(); i++)
			count2[str2.charAt(i) - 'a']++;

		int result = 0;
		for (int i = 0; i < 26; i++)
			result += Math.abs(count1[i] - count2[i]);
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
