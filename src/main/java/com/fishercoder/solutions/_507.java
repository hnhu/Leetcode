package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

 Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

 Example:
 Input: 28
 Output: True
 Explanation: 28 = 1 + 2 + 4 + 7 + 14

 Note: The input number n will not exceed 100,000,000. (1e8)

 */
public class _507 {

	// return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
	public boolean checkPerfectNumber(int num) {
		List<Integer> primes = findPrimeFactors(num);
		Set<Integer> factors = createFactors(primes);
		factors.add(1);
		int sum = 0;
		for (int f : factors) {
			sum += f;
		}
		return sum == num * 2;
	}

	private Set<Integer> createFactors(List<Integer> primes) {
		Set<Integer> factors = new HashSet<>();
		if (primes.size() == 1) {
			factors.add(primes.get(0));
			return factors;
		}
		int factor = primes.get(0);
		primes.remove(0);
		Set<Integer> subFactors = createFactors(primes);
		factors.add(factor);
		factors.addAll(subFactors);
		for (Integer i : subFactors) {
			factors.add(factor * i);
		}
		return factors;
	}

	private List<Integer> findPrimeFactors(int num) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < Math.sqrt(num) + 1; i++) {
			if (num % i == 0) {
				primes.add(i);
				primes.addAll(findPrimeFactors(num / i));
				return primes;
			}
		}
		primes.add(num);
		return primes;
	}

}
