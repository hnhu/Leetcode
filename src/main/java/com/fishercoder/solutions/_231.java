package com.fishercoder.solutions;

/**231. Power of Two
 *
 * Given an integer, write a function to determine if it is a power of two.*/

public class _231 {
    public boolean isPowerOfTwo(int n) {
		return n > 0 && Integer.bitCount(n) == 1;
    }

    public static void main(String... strings) {
        _231 test = new _231();
        System.out.println(test.isPowerOfTwo(14));
    }
}
