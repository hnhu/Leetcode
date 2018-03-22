package com.fishercoder.solutions;

/**
 * 66. Plus One
 *
 * Given a non-negative number represented as an array of digits, plus one to the number. The digits
 * are stored such that the most significant digit is at the head of the list.
 */
public class _66 {

	public static class Solution1 {
		public int[] plusOne(int[] digits) {
			int index = digits.length - 1;
			digits[index] += 1;
			while (true) {
				if (digits[index] < 10) {
					return digits;
				}

				digits[index] %= 10;
				if (index == 0) {
					int[] ret = new int[digits.length + 1];
					System.arraycopy(digits, 0, ret, 1, digits.length);
					ret[0] = 1;
					return ret;
				} else {
					digits[index - 1] += 1;
					index--;
				}

			}
		}
	}
}
