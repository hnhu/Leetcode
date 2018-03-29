package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

import com.fishercoder.common.classes.TreeNode;

/**257. Binary Tree Paths
 *
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/

public class _257 {
	public static class Solution1 {

		public List<String> binaryTreePaths(TreeNode root) {
			List<String> ret = new ArrayList<>();
			if (root == null) {
				return ret;
			}

			if (root.left == null && root.right == null) {
				ret.add(root.val + "");
				return ret;
			}
			if (root.left != null) {
				ret.addAll(binaryTreePaths(root.left, root.val + ""));
			}
			if (root.right != null) {
				ret.addAll(binaryTreePaths(root.right, root.val + ""));
			}
			return ret;
		}

		private List<String> binaryTreePaths(TreeNode root, String prefix) {
			List<String> ret = new ArrayList<>();
			if (root == null) {
				return ret;
			}

			if (root.left == null && root.right == null) {
				ret.add(prefix + "->" + root.val);
				return ret;
			}
			if (root.left != null) {
				ret.addAll(binaryTreePaths(root.left, prefix + "->" + root.val));
			}
			if (root.right != null) {
				ret.addAll(binaryTreePaths(root.right, prefix + "->" + root.val));
			}
			return ret;
		}
	}
}
