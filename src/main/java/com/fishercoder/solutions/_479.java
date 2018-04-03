package com.fishercoder.solutions;

/**
 * 479. Largest Palindrome Product
 *
 * Find the largest palindrome made from the product of two n-digit numbers.
 Since the result could be very large, you should return the largest palindrome mod 1337.

 Example:
 Input: 2
 Output: 987

 Explanation: 99 x 91 = 9009, 9009 % 1337 = 987

 Note:
 The range of n is [1,8].
 */
public class _479 {
	/**reference: https://discuss.leetcode.com/topic/74125/java-solution-using-assumed-max-palindrom*/
	public int largestPalindrome(int n) {
		if (n == 1) {
			return 9;
		}
		int seed = (int) (Math.pow(10, n) - 1);
		while (true) {
			long palindrome = createPalindrome(seed--);
			if (containsTwoNFactor(palindrome, n)) {
				return (int) (palindrome % 1337);
			}
		}
	}

	private boolean containsTwoNFactor(long palindrome, int n) {
		if (palindrome % 3 != 0) {
			return false;
		}
		long upper = (long) (Math.pow(10, n) - 1);
		long lower = (long) (Math.pow(10, n) / 10);
		long sqrt = (long) Math.sqrt(palindrome);
		for (long i = upper; i >= sqrt; i--) {
			if (palindrome % i == 0) {
				if (palindrome / i >= lower && palindrome / i <= upper) {
					return true;
				}
			}
		}
		return false;
	}

	private long createPalindrome(Integer seed) {
		return Long.valueOf(seed.toString() + new StringBuilder(seed.toString()).reverse().toString());
	}

	public static void main(String... args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Math.pow(99999999, 2) < Long.MAX_VALUE);
		_479 test = new _479();
		System.out.println(test.largestPalindrome(3));
	}
}
