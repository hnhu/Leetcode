package com.fishercoder.solutions;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class _14 {

	public static class Solution1 {
		public String longestCommonPrefix(String[] strs) {
			if (strs == null || strs.length == 0) {
				return "";
			}
			if (strs.length == 1) {
				return strs[0];
			}
			Character c;
			for (int i = 0;; i++) {// 可以增加i < strs[0].length()条件跳出循环，以防止程序错误时死循环
				c = null;
				for (String str : strs) {
					if (str == null || str.length() < i + 1) {
						return str + "";
					}
					if (c == null) {
						c = str.charAt(i);
					} else {
						if (!c.equals(str.charAt(i))) {
							return str.substring(0, i) + "";
						}
					}
				}
			}
		}
	}

}
