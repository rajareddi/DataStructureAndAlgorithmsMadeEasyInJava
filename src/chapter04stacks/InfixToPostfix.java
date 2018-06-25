/*Copyright (c) 12-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: InfixToPost.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter04stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPostfix {
	static Stack<Character> operators = new Stack<Character>();

	public static void main(String[] args) throws IOException {

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		// get input from user
		System.out.print("\nEnter the algebraic expression in infix: ");
		String infix = keyboard.readLine();

		// output as postfix
		System.out.println("The expression in postfix is:" + toPostfix(infix));
	}

	private static String toPostfix(String infix) {
		String postfix = "";
		char[] arr = infix.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (Character.isLetterOrDigit(c)) {
				postfix += c;
			} else if (c == '(') {
				operators.push(c);
			} else if (c == ')') {
				while (!(operators.peek() == '(')) {
					postfix += operators.pop();
				}
				operators.pop();
			} else
			// print operators occurring before it that have greater precedence
			{
				while (!operators.isEmpty() && !(operators.peek() == '(') && prec(c) <= prec(operators.peek()))
					postfix = postfix + operators.pop();

				operators.push(c);
			}

		}
		while (!operators.isEmpty())
			postfix = postfix + operators.pop();
		return postfix;

	}

	static int prec(char x) {
		if (x == '+' || x == '-')
			return 1;
		if (x == '*' || x == '/' || x == '%')
			return 2;
		return 0;
	}
}
