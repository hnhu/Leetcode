package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 111. Minimum Depth of Binary Tree
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * */

public class _111 {
	/**
	 * We can solve this problem using both BFS and DFS:
	 * DFS is to visit every single root to leaf path and return the shortest one.
	 * BFS is to visit every level and return whenever we find the first leaf node.
	 */

	public static class Solution {

		public int minDepth(TreeNode root) {

			if (root == null) {
				return 0;
			}
			if (root.left == null && root.right == null) {
				return 1;
			}
			if (root.left == null || root.right == null) {
				return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
			}
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

		}

	}

}
