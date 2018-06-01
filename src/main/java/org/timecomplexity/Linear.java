package org.timecomplexity;

/**
 * O(n)
 *
 */
public class Linear {

	public static void main(String[] args) {
		int[] n1 = { 3, 1, 2 };
		findMax(n1);

		int[] n2 = { 4, 5, 6, 1, 9, 2, 8, 3, 7 };
		findMax(n2);
	}

	/**
	 * Largest item on an unsorted array
	 * 
	 * @param n
	 * @return
	 */
	public static int findMax(int[] n) {
		int max = 0;
		int counter = 0;
		for (int i = 0; i < n.length; i++) {
			counter++;
			if (max < n[i]) {
				max = n[i];
			}
		}
		
		System.out.println("n: " + n.length + ", counter: " + counter);
		return max;
	}

}
