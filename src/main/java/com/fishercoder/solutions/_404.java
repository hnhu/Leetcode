package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**Find the sum of all left leaves in a given binary tree.

 Example:

   3
  / \
 9  20
   /  \
  15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.*/
public class _404 {

	public int sumOfLeftLeaves(TreeNode root) {
		int ret = 0;
		if (root == null) {
			return ret;
		}
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				ret += root.left.val;
			}
			ret += sumOfLeftLeaves(root.left);
		}
		if (root.right != null) {
			ret += sumOfLeftLeaves(root.right);
		}
		return ret;
	}
}
