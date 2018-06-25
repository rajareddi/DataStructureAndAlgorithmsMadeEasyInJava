
package chapter23Arrays;

public class NoNOverLapSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 5;
		int size = arr.length;
		int ans = caluclate(arr, size, k);
		System.out.println(ans);
	}

	private static int caluclate(int[] arr, int n, int k) {
		int ans = 0;
		int count = 0;
		int flag = 0;
		for (int i = 0; i < arr.length;) {

			count = 0;
			flag = 0;
			while (i < n && arr[i] <= k) {
				count++;
				if (k == arr[i]) {
					flag = 1;
				}
				i++;
			}

			if (1 == flag) {
				ans += count;
			}
			while (i < n && arr[i] > k)
				i++;

		}
		return ans;
	}
}
