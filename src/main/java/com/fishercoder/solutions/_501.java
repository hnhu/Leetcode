package com.fishercoder.solutions;

import java.util.Stack;

import com.fishercoder.common.classes.TreeNode;

/**
 * 501. Find Mode in Binary Search Tree
 * Given a binary search tree with duplicates. You have to find all the mode(s) in given binary tree.

 For example:
 Given binary tree [1,null,2,2],
  1
   \
   2
  /
 2
 return [2].

 Note: If a tree has more than one mode, you can return them in any order.

 */
public class _501 {

	public static class Solution {

		public int[] findMode(TreeNode root) {
			if (root == null) {
				return new int[] {};
			}
			if (root.left == null && root.right == null) {
				return new int[] { root.val };
			}
			Integer val = null;
			int max = Integer.MIN_VALUE; // max count
			int count = 0;
			int size = 0; // size of return array
			Stack<TreeNode> stack = new Stack<>();
			TreeNode p = root;
			// count
			while (p != null || !stack.isEmpty()) {
				if (p != null) {
					stack.push(p);
					p = p.left;
				} else {
					p = stack.pop();
					if (val == null || p.val != val) {
						val = p.val;
						count = 1;
					} else {
						count++;
					}
					if (count == max) {
						size++;
					} else if (count > max) {
						max = count;
						size = 1;
					}
					p = p.right;
				}
			}
			// set ret
			int[] ret = new int[size];
			p = root;
			val = null;
			count = 0;
			while (p != null || !stack.isEmpty()) {
				if (p != null) {
					stack.push(p);
					p = p.left;
				} else {
					p = stack.pop();
					if (val == null || p.val != val) {
						val = p.val;
						count = 1;
					} else {
						count++;
					}
					if (count == max) {
						ret[--size] = p.val;
						if (size == 0) {
							return ret;
						}
					}
					p = p.right;
				}
			}

			return ret;
		}
	}
}
