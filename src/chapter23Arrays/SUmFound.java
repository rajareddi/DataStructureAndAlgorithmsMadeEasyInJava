
package chapter23Arrays;

import java.util.Arrays;

public class SUmFound {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length-1;
		boolean present = findSUm(arr, n, 50);
		System.out.println(present);
	}

	private static boolean findSUm(int[] arr, int n, int sum) {

		int l = 0;
		Arrays.sort(arr);

		while (l < n) {
			int i = arr[l] + arr[n];
			if (i == sum) {
				return true;

			}else if(i<sum){
				l++;
			}else{
				n--;
			}
		}
		return false;
	}

}
