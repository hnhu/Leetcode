package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note: You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
 * additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n
 * respectively.
 */

public class _88 {

	public static class Solution1 {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			System.arraycopy(nums2, 0, nums1, m, n);
			Arrays.sort(nums1, 0, m + n);
		}
	}
}
