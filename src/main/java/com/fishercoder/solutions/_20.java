package com.fishercoder.solutions;

/**
 * 20. Valid Parentheses
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/
public class _20 {

	public boolean isValid(String s) {
		char[] stack = new char[s.length()];
		int head = 0;
		for (char c : s.toCharArray()) {
			switch (c) {
			case '[':
			case '(':
			case '{':
				stack[head++] = c; // push
				break;
			case ']':
				if (head != 0 && stack[--head] == '[') { // pop
					break;
				} else {
					return false;
				}
			case ')':
				if (head != 0 && stack[--head] == '(') {
					break;
				} else {
					return false;
				}
			case '}':
				if (head != 0 && stack[--head] == '{') {
					break;
				} else {
					return false;
				}
			default:
				break;
			}
		}
		return head == 0;
	}
}
