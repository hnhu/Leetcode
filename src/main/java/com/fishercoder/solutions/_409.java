package com.fishercoder.solutions;

/**
	Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
	
	This is case sensitive, for example "Aa" is not considered a palindrome here.
	
	Note:
	Assume the length of given string will not exceed 1,010.
	
	Example:
	
	Input:
	"abccccdd"
	
	Output:
	7
	
	Explanation:
	One longest palindrome that can be built is "dccaccd", whose length is 7.

 */
public class _409 {
	public int longestPalindrome(String s) {
		int[] count = new int[256];
		for (char ch : s.toCharArray()) {
			count[ch]++;
		}
		int flag = 0;
		int half = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			half += count[ch] / 2;
			if (flag == 0) {
				flag = count[ch] % 2;
			}
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			half += count[ch] / 2;
			if (flag == 0) {
				flag = count[ch] % 2;
			}
		}
		return half * 2 + flag;
	}
}
