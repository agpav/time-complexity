package org.timecomplexity;

/**
 * O(n^2)
 *
 */
public class Quadratic {

	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3, 4 };
		hasDuplicates(n1);

		int[] n2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		hasDuplicates(n2);
	}

	/**
	 * Has duplicates
	 * 
	 * @param n
	 * @return
	 */
	public static boolean hasDuplicates(int[] n) {
		int counter = 0;
		for (int outter = 0; outter < n.length; outter++) {
			for (int inner = 0; inner < n.length; inner++) {
				counter++;
				if (outter == inner) {
					continue;
				}
				if (n[outter] == n[inner]) {
					return true;
				}
			}
		}

		System.out.println("n: " + n.length + ", counter: " + counter);
		return false;
	}

	/**
	 * Bubble sort
	 * 
	 * @param n
	 * @return
	 */
	public static int[] sort(int[] n) {
		for (int outer = 0; outer < n.length; outer++) {
			int outerElement = n[outer];
			for (int inner = outer + 1; inner < n.length; inner++) {
				int innerElement = n[inner];
				if (outerElement > innerElement) {
					// swap
					n[outer] = innerElement;
					n[inner] = outerElement;
					// update references
					outerElement = n[outer];
					innerElement = n[inner];
				}
			}
		}
		return n;
	}
}
