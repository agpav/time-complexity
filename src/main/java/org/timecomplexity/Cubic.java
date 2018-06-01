package org.timecomplexity;

import java.util.ArrayList;
import java.util.List;

/**
 * O(n^3)
 *
 */
public class Cubic {

	public static void main(String[] args) {
		List<int[]> solutions = findXYZ(10);
		for (int[] n : solutions) {
			System.out.println("x: " + n[0] + " y: " + n[1] + " z: " + n[2]);
		}
	}

	/**
	 * 3x + 9y + 8z = 79
	 * 
	 * @param n
	 * @return
	 */
	public static List<int[]> findXYZ(int n) {
		List<int[]> solutions = new ArrayList<>();
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				for (int z = 0; z < n; z++) {
					if (3 * x + 9 * y + 8 * z == 79) {
						int[] arr = { x, y, z };
						solutions.add(arr);
					}
				}
			}
		}
		return solutions;
	}

}
