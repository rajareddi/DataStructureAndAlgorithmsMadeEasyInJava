
package chapter23Arrays;

import java.util.Scanner;
import java.util.Stack;

public class NiceArches {
	public static void main(String args[]) throws Exception {
		System.out.println("Enter test cases number :");
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		System.out.println("Number of test case " + tc);
		int count = 0;
		for (int i = 0; i < tc; i++) {
			String input = sc.next();
			if (isBubly(input)) {
				System.out.println(" Given string is bubly " + input);
				count++;
			} else {
				System.out.println("NOt " + input);
			}
		}
		System.out.print(count);
		sc.close();

	}

	private static boolean isBubly(String str) {

		char[] array = str.toCharArray();
		Stack stack = new Stack();
		for (int i = 0; i < array.length; i++) {
			if (stack.isEmpty()) {
				stack.push(array[i]);
			} else {
				char firstone = (char) stack.peek();
				if (firstone == array[i]) {
					stack.pop();
				} else {
					stack.push(array[i]);
				}
			}

		}
		return stack.isEmpty();
	}

}
