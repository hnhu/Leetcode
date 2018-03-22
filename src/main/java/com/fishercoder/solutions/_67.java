package com.fishercoder.solutions;

/**
 * 67. Add Binary
 *
 * Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */

public class _67 {
	public static class Solution1 {
		/**
		 * credit: https://discuss.leetcode.com/topic/13698/short-ac-solution-in-java-with-explanation
		 * 1. use StringBuilder.reverse() function! Nice!
		 * 2. if a numeric number is represented/stored in String, how to get its value: use Character.getNumericValue(s.charAt(i))
		 * 3. directly adding/subtracting chars will end up working with their ASCII numbers, e.g. chars[0] = 'a', chars[1] = 'b', then chars[0] + chars[1] will become 195.
		 */
		public String addBinary(String a, String b) {
			int i = a.length() - 1;
			int j = b.length() - 1;
			int carry = 0;
			int digit;
			StringBuilder sb = new StringBuilder();
			while (i >= 0 || j >= 0) {
				digit = carry;
				if (i >= 0) {
					digit += a.charAt(i--) - '0';
				}
				if (j >= 0) {
					digit += b.charAt(j--) - '0';
				}
				carry = digit / 2;
				sb.append(digit % 2);
			}
			if (carry != 0) {
				sb.append(carry);
			}
			return sb.reverse().toString();

		}
	}
}
