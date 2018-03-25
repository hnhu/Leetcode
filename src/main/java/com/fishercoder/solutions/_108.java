package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class _108 {

	public static class Solution1 {
		public TreeNode sortedArrayToBST(int[] nums) {
			return sortedArrayToBST(nums, 0, nums.length);
		}

		private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
			if (left >= right) {
				return null;
			}
			int mid = (left + right) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = sortedArrayToBST(nums, left, mid);
			root.right = sortedArrayToBST(nums, mid + 1, right);
			return root;
		}
	}

}
