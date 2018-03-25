package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]

 */
public class _118 {

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
