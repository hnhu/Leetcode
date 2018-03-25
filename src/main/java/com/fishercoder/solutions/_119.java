package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 */

public class _119 {

	public static class Solution1 {

		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> list = new ArrayList<>();
			if (numRows == 0) {
				return list;
			}
			for (int i = 0; i < numRows; i++) {
				list.add(getRow(i));
			}
			return list;

		}

		public List<Integer> getRow(int rowIndex) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < rowIndex + 1; i++) {
				list.add(c(rowIndex, i));
			}
			return list;

		}

		private int c(int m, int n) {
			if (n == 0) {
				return 1;
			}
			long ret = 1;
			for (int i = 1; i <= n; i++) {
				ret *= m--;
				ret /= i;
			}
			return (int) ret;
		}

	}

}
