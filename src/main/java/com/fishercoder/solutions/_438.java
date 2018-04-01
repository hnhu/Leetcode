package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 *
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.

 Example 1:
 Input:
 s: "cbaebabacd" p: "abc"
 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".

 Example 2:
 Input:
 s: "abab" p: "ab"
 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".*/

public class _438 {

	public static class Solution2 {
		public List<Integer> findAnagrams(String s, String p) {
			List<Integer> ret = new ArrayList<>();
			int[] count = new int[26];
			for (int i = 0; i < p.length(); i++) {
				count[p.charAt(i) - 'a']++;
			}
			char[] charArray = s.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				count[charArray[i] - 'a']--;
				if (i == p.length() - 1) {
					if (isZeroArray(count)) {
						ret.add(0);
					}
				} else if (i > p.length() - 1) {
					count[charArray[i - p.length()] - 'a']++;
					if (isZeroArray(count)) {
						ret.add(i - p.length() + 1);
					}
				}
			}
			return ret;
		}

		private boolean isZeroArray(int[] arr) {
			for (int i : arr) {
				if (i != 0) {
					return false;
				}
			}
			return true;
		}
	}
}
