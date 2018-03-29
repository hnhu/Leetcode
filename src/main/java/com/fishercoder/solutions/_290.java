package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.

 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class _290 {

	public static class Solution1 {
		public boolean wordPattern(String pattern, String str) {
			if (pattern == null || str == null) {
				return pattern == str;
			}
			Map<Character, String> map = new HashMap<>();
			String[] s = str.split(" ");

			if (pattern.length() != s.length) {
				return false;
			}
			char key;
			for (int i = 0; i < s.length; i++) {
				key = pattern.charAt(i);
				if (map.containsKey(key)) {

					if (!map.get(key).equals(s[i])) {
						return false;
					}
				} else {
					if (map.containsValue(s[i])) {
						return false;
					}
					map.put(key, s[i]);
				}
			}
			return true;
		}
	}

}