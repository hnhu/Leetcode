package com.fishercoder.solutions;

/**
 * 189. Rotate Array
 *
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * */

public class _189 {

	public static class Solution1 {

		public void rotate(int[] nums, int k) {
			k %= nums.length;
			if (k < nums.length / 2) {
				rotateRight(nums, k);
			} else {
				rotateLeft(nums, nums.length - k);
			}
		}

		private void rotateRight(int[] nums, int k) {
			k %= nums.length;
			int[] cache = new int[k];
			System.arraycopy(nums, nums.length - k, cache, 0, k);
			for (int i = 0; i < k; i++) {
				for (int j = nums.length - 1 - i; j >= k; j -= k) {
					nums[j] = nums[j - k];
				}
			}
			System.arraycopy(cache, 0, nums, 0, k);
		}

		private void rotateLeft(int[] nums, int k) {
			k %= nums.length;
			int[] cache = new int[k];
			System.arraycopy(nums, 0, cache, 0, k);
			for (int i = 0; i < k; i++) {
				for (int j = i; j < nums.length - k; j += k) {
					nums[j] = nums[j + k];
				}
			}
			System.arraycopy(cache, 0, nums, nums.length - k, k);
		}

	}
}
