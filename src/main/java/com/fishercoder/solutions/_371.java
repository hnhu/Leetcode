package com.fishercoder.solutions;

/**Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.*/
public class _371 {

	public int getSum(int a, int b) {
		int t;
		while (b != 0) {
			t = a ^ b; // sum
			b = (a & b) << 1; // carry
			a = t;
		}
		return a;
	}
}
