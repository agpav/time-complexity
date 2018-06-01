package org.timecomplexity;

import java.util.HashMap;
import java.util.Map;

/**
 * O(1)
 *
 */
public class Constant {

	private static Map<String, String> dictionary = new HashMap<>();
	// {the: 22038615, be: 12545825, and: 10741073, of: 10343885, a: 10144200, in:
	// 6996437, to: 6332195 /* ... */};

	public static void main(String[] args) {
		System.out.println(isEvenOrOdd(10)); // => Even
		System.out.println(isEvenOrOdd(10001)); // => Odd
	}

	/**
	 * Find if a number is odd or even
	 * 
	 * @param n
	 * @return
	 */
	public static String isEvenOrOdd(int n) {
		return (n % 2 == 0) ? "Even" : "Odd";
	}

	/**
	 * Look-up table
	 * 
	 * @return
	 */
	public static String getWordFrequency(Map<String, String> dictionary, String word) {
		return dictionary.get(word);
	}

}
