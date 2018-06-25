package chapter23Arrays;

import java.util.Scanner;
import java.util.Stack;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class MaximizetheEarning {
	public static void main(String args[]) throws Exception {

		int i = 6;// s.nextInt();

		int[] input = { 16, 17, 4, 3, 5, 2 };
		int max = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int j = i - 1; j > 0; j--) {
			if (input[j] > max) {
				max = input[j];
				stack.push(max);
			}
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop() +" ");
		}
	}

}
