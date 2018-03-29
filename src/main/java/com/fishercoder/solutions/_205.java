package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.*/
public class _205 {
	/**space should be O(1) since it only has alphabetic letters which are capped at 52.*/

	public boolean isIsomorphic(String s1, String s2) {
		if (s1 == null && s2 == null) {
			return true;
		}
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i)) || map.containsValue(s2.charAt(i))) {
				if (!map.containsKey(s1.charAt(i)) || map.get(s1.charAt(i)) != s2.charAt(i)) {
					return false;
				}
			} else {
				map.put(s1.charAt(i), s2.charAt(i));
			}
		}
		return true;
	}

}
