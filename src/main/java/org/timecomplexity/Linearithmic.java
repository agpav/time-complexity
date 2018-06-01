package org.timecomplexity;

import java.util.Arrays;

/**
 * O(n log n)
 *
 */
public class Linearithmic {

	public static void main(String[] args) {
		int[] n = { 5, 2, 8, 3, 0, 1};
		n = sort(n);
		System.out.println(Arrays.toString(n));
	}

	/**
	 * Mergesort
	 * 
	 * @param n
	 * @return
	 */
	public static int[] sort(int[] n) {
		int length = n.length;

		// base case
		if (length == 1) {
			return n;
		}

		if (length == 2) {
			if (n[0] > n[1]) {
				int[] arr = { n[1], n[0] };
				return arr;
			} else {
				int[] arr = { n[0], n[1] };
				return arr;
			}
		}

		// slit and merge
		int mid = length / 2;
		return merge(sort(Arrays.copyOfRange(n, 0, mid)), sort(Arrays.copyOfRange(n, mid, n.length)));
	}

	public static int[] merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
		int counter = 0;
		// merge elements on a and b in asc order. Run-time O(a + b)
		for (int ai = 0, bi = 0; ai < a.length || bi < b.length;) {
			if ( ai >= a.length || a[ai] > b[bi]) {
				merged[counter++] = b[bi++];
			} else {
				merged[counter++] = a[ai++];
			}
		}
		return merged;
	}

}
