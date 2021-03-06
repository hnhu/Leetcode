package com.fishercoder.solutions;

/**198. House Robber

You are a professional robber planning to rob houses along a street.
 Each house has a certain amount of money stashed,
 the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class _198 {

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		int m1 = 0;
		int m2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				m1 = Math.max(m1 + nums[i], m2);
			} else {
				m2 = Math.max(m1, m2 + nums[i]);
			}
		}
		return Math.max(m1, m2);
	}

}
