package com.fishercoder.solutions;

/**168. Excel Sheet Column Title
 *
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */
public class _168 {

	public String convertToTitle_accepted_more_beautiful(int n) {
		StringBuilder sb = new StringBuilder();
		int remainder;
		while (n > 0) {
			remainder = (n - 1) % 26;
			sb.append((char) (remainder + 'A'));
			n = (n - 1) / 26;
		}
		return sb.reverse().toString();
	}

}