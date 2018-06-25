
package chapter04stacks;

import java.util.Stack;

public class StockSpan {

	private StockSpan() {
	}

	public static void main(String[] args) {
		int price1[] = { 100, 80, 60, 70, 60, 75, 85 };
		int result[] = stockSpan(price1);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] stockSpan(int[] stock) {

		final Stack<Integer> stack = new Stack<Integer>();

		int[] span = new int[stock.length];
		// 100, 80, 60, 70, 60, 75, 85
		for (int i = 0; i < stock.length; i++) {
			int index = 0;
			span[i] = 1;
			while (!stack.isEmpty() && stock[stack.peek()] <= stock[i]) {
				index = stack.pop();
				span[i] = i - index + span[index];
			}
			stack.push(i);
		}

		return span;
	}
}
