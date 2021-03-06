package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.

 Note:
 N is a positive integer and won't exceed 10,000.
 All the scores of athletes are guaranteed to be unique.
 */
public class _506 {

	public String[] findRelativeRanks(int[] nums) {
		int times = 10;
		while (times < nums.length) {
			times *= 10;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= times;
			nums[i] += i;
		}
		Arrays.sort(nums);

		String[] ranking = new String[nums.length];
		for (int i = 0; i < ranking.length; i++) {
			ranking[nums[i] % times] = "" + (ranking.length - i);
		}
		if (nums.length > 0) {
			ranking[nums[ranking.length - 1] % times] = "Gold Medal";
		}
		if (nums.length > 1) {
			ranking[nums[ranking.length - 2] % times] = "Silver Medal";
		}
		if (nums.length > 2) {
			ranking[nums[ranking.length - 3] % times] = "Bronze Medal";
		}
		return ranking;
	}

}
