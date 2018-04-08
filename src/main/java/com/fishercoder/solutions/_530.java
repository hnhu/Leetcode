package com.fishercoder.solutions;

import java.util.Stack;

import com.fishercoder.common.classes.TreeNode;

/**
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

  1
   \
   3
  /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 Note: There are at least two nodes in this BST.
 */
public class _530 {

	public int getMinimumDifference(TreeNode root) {
		Integer val = null;
		int min = Integer.MAX_VALUE;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = root;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				p = stack.pop();
				if (val == null) {
					val = p.val;
				} else {
					min = Math.min(min, p.val - val);
					val = p.val;
				}
				p = p.right;
			}
		}
		return min;
	}
}
