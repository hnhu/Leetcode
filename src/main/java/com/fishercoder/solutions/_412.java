package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *
 * Write a program that outputs the string representation of numbers from 1 to n.

 But for multiples of three it should output “Fizz” instead of the number and for
 the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “_412”.

 Example:

 n = 15,

 Return:
 [
 "1",
 "2",
 "Fizz",
 "4",
 "Buzz",
 "Fizz",
 "7",
 "8",
 "Fizz",
 "Buzz",
 "11",
 "Fizz",
 "13",
 "14",
 "_412"
 ]*/
public class _412 {

	public List<String> fizzBuzz(int n) {
		List<String> ret = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0) {
				ret.add(i % 5 == 0 ? "FizzBuzz" : "Fizz");
			} else {
				ret.add(i % 5 == 0 ? "Buzz" : "" + i);
			}
		}
		return ret;
	}

}
