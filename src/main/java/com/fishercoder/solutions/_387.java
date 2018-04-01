package com.fishercoder.solutions;

/**
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.

 */

public class _387 {

    public static int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		int[] uniq = new int[26];
		for (int i = 0; i < arr.length; i++) {
			uniq[arr[i] - 'a']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (uniq[arr[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

    public static void main(String... strings) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

}
