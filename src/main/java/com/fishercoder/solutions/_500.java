package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * <p>
 * <p>
 * American keyboard
 * <p>
 * <p>
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class _500 {

	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<>();
		for (String word : words) {
			if (acceptWord(word)) {
				list.add(word);
			}
		}
		String[] ret = new String[list.size()];
		list.toArray(ret);
		return ret;
	}

	private boolean acceptWord(String word) {
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (getLine(charArray[i]) != getLine(charArray[i + 1])) {
				return false;
			}
		}
		return true;
	}

	private int getLine(char ch) {
		switch (ch) {
		case 'q':
		case 'w':
		case 'e':
		case 'r':
		case 't':
		case 'y':
		case 'u':
		case 'i':
		case 'o':
		case 'p':
		case 'Q':
		case 'W':
		case 'E':
		case 'R':
		case 'T':
		case 'Y':
		case 'U':
		case 'I':
		case 'O':
		case 'P':
			return 1;
		case 'a':
		case 's':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'A':
		case 'S':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
			return 2;
		case 'z':
		case 'x':
		case 'c':
		case 'v':
		case 'b':
		case 'n':
		case 'm':
		case 'Z':
		case 'X':
		case 'C':
		case 'V':
		case 'B':
		case 'N':
		case 'M':
			return 3;
		default:
			return 0;
		}
	}
}
