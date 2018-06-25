/*Copyright (c) 12-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: StackReversal.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter04stacks;

import java.util.Stack;

public class StackReversal {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		

		reverse(stack);
		System.err.println(stack.toString());
	}

	private static void reverse(Stack<Integer> stack) {
		System.err.println(stack.toString());
		if (stack.isEmpty()) {
			return;
		}
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);

	}

	private static void insertAtBottom(Stack<Integer> stack, int data) {
	
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
		System.out.println(stack.toString());

	}

}
