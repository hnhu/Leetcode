package com.fishercoder.solutions;

/**342. Power of Four
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?*/
public class _342 {
	public boolean isPowerOfFour_bit_manipulation(int num) {
		return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
	}

	public static void main(String... strings) {
		int temp = 4;
		int maxPowerOf4 = 4;
		while (temp > 0) {
			temp *= 4;
			if (temp > 0) {
				maxPowerOf4 = temp;
			}
		}
		System.out.println("maxPowerOf4 is: " + maxPowerOf4);

		System.out.println(Integer.parseInt("55555555", 16));
		System.out.println(Integer.toBinaryString(Integer.parseInt("55555555", 16)));
	}
}
