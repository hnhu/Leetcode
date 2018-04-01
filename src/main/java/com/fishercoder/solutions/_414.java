package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 414. Third Maximum Number
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).

 Example 1:
 Input: [3, 2, 1]

 Output: 1

 Explanation: The third maximum is 1.
 Example 2:
 Input: [1, 2]

 Output: 2

 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 Example 3:
 Input: [2, 2, 3, 1]

 Output: 1

 Explanation: Note that the third maximum here means the third maximum distinct number.
 Both numbers with value 2 are both considered as second maximum.
 */
public class _414 {

	public int thirdMax(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		long[] top = new long[3];
		Arrays.fill(top, Long.MIN_VALUE);
		for (int i = 0; i < nums.length; i++) {
			if (top[0] != nums[i] && top[1] != nums[i] && top[2] != nums[i]) {
				updateTop2(top, 1, 2, updateTop2(top, 0, 1, nums[i]));
			}
		}
		return (int) ((top[2] == Long.MIN_VALUE) ? top[0] : top[2]);
	}

	/**
	 * 
	 *  update top[j], top[k] with top2(top[j], top[k], n), and return min(top[j], top[k], n)
	 */
	private long updateTop2(long[] top, int j, int k, long n) { // given top[j] > top[k]
		if (n < top[k]) {
			return n;
		}
		if (n < top[j]) {
			long t = top[k];
			top[k] = n;
			return t;
		}
		// min > top[j];
		long t = top[k];
		top[k] = top[j];
		top[j] = n;
		return t;
	}
}
