package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.*/

public class _110 {

	class Solution1 {
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}
			if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
				return false;
			}
			return isBalanced(root.left) && isBalanced(root.right);
		}

		private int maxDepth(TreeNode root) {
			if (root == null) {
				return 0;
			}
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}
	}

}