package org.timecomplexity;

import java.util.Arrays;

/**
 * O(log n)
 *
 */
public class Logarithmic {

	public static void main(String[] args) {
		String[] directory = { "Adrian", "Bella", "Charlotte", "Daniel", "Emma", "Hanna", "Isabella", "Jayden",
				"Kaylee", "Luke", "Mia", "Nora", "Olivia", "Paisley", "Riley", "Thomas", "Wyatt", "Xander", "Zoe" };
		System.out.println(indexOf(directory, "Hanna", 0)); // => 5
		System.out.println(indexOf(directory, "Adrian", 0)); // => 0
		System.out.println(indexOf(directory, "Zoe", 0)); // => 18

	}

	/**
	 * Binary search
	 * 
	 * @param array
	 * @param element
	 * @param offset
	 * @return
	 */
	public static int indexOf(String[] array, String element, int offset) {
		// split array in half
		int half = array.length / 2;
		String current = array[half];
		if (current == element) {
			return offset + half;
		} else if (element.compareTo(current) > 1) {
			String[] right = Arrays.copyOfRange(array, half, array.length);
			return indexOf(right, element, offset + half);
		} else {
			String[] left = Arrays.copyOfRange(array, 0, half);
			return indexOf(left, element, offset);
		}
	}
}
