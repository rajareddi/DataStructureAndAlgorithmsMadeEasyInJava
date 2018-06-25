
package chapter23Arrays;

public class MaxSum {
	public static void main(String[] args) {
		// |Ai - Aj| + |i - j|

		int[] input = { 1, 5, 2, 9, 7 };
		int window = 3;
		int max = getMaxWIndowSizeSLide(input, window);
		System.out.println(max);
		

	}

	private static int getMaxWIndowSize(int[] input, int window) {
		int max = 0;
		int currentW = 0;
		for (int i = 0; i < (input.length - window) + 1; i++) {
			for (int j = 0; j < window; j++) {
				currentW = currentW + input[i + j];
			}
			max = Math.max(currentW, max);
			currentW = 0;

		}
		return max;
	}

	private static int getMaxWIndowSizeSLide(int[] input, int window) {
		int max = 0;
		for (int i = 0; i < window; i++) {
			max += input[i];
		}
		int current = max;
		for (int i = window; i < input.length; i++) {
			current = current + input[i] - input[i - window];
			max = Math.max(max, current);
		}

		return max;
	}
}
