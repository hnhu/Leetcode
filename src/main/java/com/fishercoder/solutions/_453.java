package com.fishercoder.solutions;

/**
 * 453. Minimum Moves to Equal Array Elements
 *
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

 Example:

 Input:
 [1,2,3]

 Output:
 3

 Explanation:
 Only three moves are needed (remember each move increments two elements):

 [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]*/

public class _453 {
	/**Looked at this solution: https://discuss.leetcode.com/topic/66557/java-o-n-solution-short
	 * i.e. Add 1 to n-1 elements basically equals to subtracting 1 from one element. So the easiest way
	 * to make all elements in this array equal is to make all of them equal to the minimum element.*/
	public static int minMoves(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		if (nums.length == 2) {
			return Math.abs(nums[0] - nums[1]);
		}
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i : nums) {
			sum += i;
			min = Math.min(min, i);
		}
		return sum - nums.length * min; // sum + x * (n-1) = (min + x) * n
	}

	public static void main(String... args) {
		int[] nums = new int[] { 1, 2, 3 };
		System.out.println(minMoves(nums));
	}

}
