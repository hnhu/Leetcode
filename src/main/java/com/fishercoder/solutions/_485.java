package com.fishercoder.solutions;

/**
 *  485. Max Consecutive Ones
	Given a binary array, find the maximum number of consecutive 1s in this array.
	
	Example 1:
	Input: [1,1,0,1,1,1]
	Output: 3
	Explanation: The first two digits or the last three digits are consecutive 1s.
	    The maximum number of consecutive 1s is 3.
	Note:
	
	The input array will only contain 0 and 1.
	The length of input array is a positive integer and will not exceed 10,000

 */
public class _485 {

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i : nums) {
			if (i == 1) {
				count++;
			} else { // i == 0
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		return max;
	}

}
