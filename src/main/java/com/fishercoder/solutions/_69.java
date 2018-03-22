package com.fishercoder.solutions;

/**
 * 69. Sqrt(x)
 *
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 */

public class _69 {
	public static class Solution1 {
		public int mySqrt(int x) {
			long left = 0;
			long right = x / 2 + 1;
			long mid;
			while (left < right) {
				mid = (left + right) / 2;
				long mid2 = mid * mid;
				if (mid2 == x) {
					return (int) mid;
				}
				if (mid2 > x) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			if (left * left > x) {
				return (int) (left - 1);
			}
			return (int) left;
		}
	}
}
