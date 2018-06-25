
package chapter23Arrays;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MicroArrayUpdate {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); //
		 * Reading input from STDIN System.out.println("Hi, " + name + "."); //
		 * Writing output to STDOUT
		 * 
		 * //Scanner Scanner s = new Scanner(System.in); String name =
		 * s.nextLine(); // Reading input from STDIN System.out.println("Hi, " +
		 * name + "."); // Writing output to STDOUT
		 * 
		 */

		// Write your code here

		int T;
		int N;
		long K;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		while (T > 0) {
			N = sc.nextInt();
			K = sc.nextLong();

			long[] arry = new long[N];
			for (int i = 0; i < N; i++) {
				arry[i] = sc.nextLong();
			}

			Arrays.sort(arry);
			long min = arry[0];
			int count = 0;
			while (K > min) {
				min++;
				count++;

			}

			System.out.print(count);
			T--;
		}

	}

}
