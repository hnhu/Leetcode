package com.fishercoder.solutions;

/**
 * Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class _415 {

	public static String addStrings(String num1, String num2) {
		if (num1.length() < num2.length()) {
			return addStrings(num2, num1);
		}
		char[] arr1 = num1.toCharArray();
		char[] arr2 = num2.toCharArray();

		for (int i = 0; i < arr2.length; i++) {
			arr1[arr1.length - arr2.length + i] += arr2[i] - '0';
		}
		int carry = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr1[i] += carry;
			if (arr1[i] > '9') {
				arr1[i] = (char) ((arr1[i] - '0') % 10 + '0');
				carry = 1;
			} else {
				carry = 0;
			}
		}
		return carry == 0 ? String.valueOf(arr1) : (carry + String.valueOf(arr1));
	}

}