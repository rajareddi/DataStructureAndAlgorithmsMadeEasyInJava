
package chapter23Arrays;

import java.util.Arrays;

public class LastIndex {

	public static void main(String[] args) {
		int[] arr = { '2', '2', '3', '3', '1' };
		int findLastID = '5';

		int index = findLastIndex(arr, findLastID);
		System.out.println(index);
	}

	private static  int findLastIndex(int[] arr, int findLastID) {
		int id = -1;
		for (int i = 0; i < arr.length; i++) {
			if (findLastID == arr[i]) {
				id = i + 1;
			}
		}

		return id;
	}

}
