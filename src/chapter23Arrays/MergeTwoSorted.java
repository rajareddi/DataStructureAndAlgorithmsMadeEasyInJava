/*Copyright (c) 07-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MergeTwoSorted.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter23Arrays;

public class MergeTwoSorted {

	public static void main(String[] args) {

		int[] arr2 = { 1, 3, 5, 7 };
		int n1 = arr2.length;

		int[] arr1 = { 2, 4, 6, 8 };
		int n2 = arr1.length;

		int[] arr3 = new int[n1 + n2];

		mergeArrays(arr1, arr2, n1, n2, arr3);

		System.out.println("Array after merging");
		for (int i = 0; i < n1 + n2; i++)
			System.out.print(arr3[i] + " ");
	}

	private static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {

		int l1 = 0, l2 = 0, k = 0;
		while (l1 < n1 && l2 < n2) {

			if (arr1[l1] < arr2[l2]) {
				arr3[k] = arr1[l1];
				k++;
				l1++;
			} else if (arr1[l1] > arr2[l2]) {
				arr3[k] = arr2[l2];
				k++;
				l2++;

			}

		}
		while (l1 < n1)
			arr3[k++] = arr1[l1++];

		// Store remaining elements of second array
		while (l2 < n2)
			arr3[k++] = arr2[l2++];
	}

}
