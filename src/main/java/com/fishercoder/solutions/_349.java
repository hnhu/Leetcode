package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**349. Intersection of Two Arrays
 *
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.*/
public class _349 {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		for (Integer i : nums1) {
			set1.add(i);
		}
		Set<Integer> set2 = new HashSet<>();
		for (Integer i : nums2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		int i = 0;
		int[] arr = new int[set1.size()];
		for (Integer j : set1) {
			arr[i++] = j;
		}
		return arr;
	}

	public static void main(String... strings) {
		_349 test = new _349();
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 2, 1 };
		test.intersection(nums1, nums2);
	}

}
