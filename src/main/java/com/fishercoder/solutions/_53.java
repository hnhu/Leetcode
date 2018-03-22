package com.fishercoder.solutions;

/**
 * 53. Maximum Subarray
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

public class _53 {

	public static class Solution1 {

		public int maxSubArray(int[] nums) {
			return maxSubArray(nums, 0, nums.length);
		}

		private int maxSubArray(int[] nums, int left, int right) {
			if (left >= right) {
				return Integer.MIN_VALUE;
			}
			if (left + 1 == right) {
				return nums[left];
			}
			if (left + 2 == right) {
				return max(nums[left], nums[right - 1], nums[left] + nums[right - 1]);
			}
			int mid = (left + right) / 2;

			int lMax = maxSubArray(nums, left, mid);
			int rMax = maxSubArray(nums, mid + 1, right);
			int mMax = nums[mid];
			int sum = mMax;
			for (int i = mid - 1; i >= left; i--) {
				sum += nums[i];
				if (sum > mMax) {
					mMax = sum;
				}
			}
			sum = mMax;
			for (int i = mid + 1; i < right; i++) {
				sum += nums[i];
				if (sum > mMax) {
					mMax = sum;
				}
			}
			return max(lMax, rMax, mMax);
		}

		private int max(int i, int j, int k) {
			return Math.max(Math.max(i, j), k);
		}

	}
}
