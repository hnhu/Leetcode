package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

 Each LED represents a zero or one, with the least significant bit on the right.


 For example, the above binary watch reads "3:25".

 Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

 Example:

 Input: n = 1
 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 Note:
 The order of output does not matter.
 The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class _401 {

	Map<Integer, List<Integer>> hours = new HashMap<>();
	Map<Integer, List<Integer>> minutes = new HashMap<>();

	public List<String> readBinaryWatch(int num) {
		if (hours.isEmpty()) {
			int key;
			for (int i = 0; i < 12; i++) {
				key = bitCount(i);
				if (hours.containsKey(key)) {
					hours.get(key).add(i);
				} else {
					List<Integer> value = new ArrayList<>();
					value.add(i);
					hours.put(key, value);
				}
			}
		}
		if (minutes.isEmpty()) {

			int key;
			for (int i = 0; i < 60; i++) {
				key = bitCount(i);
				if (minutes.containsKey(key)) {
					minutes.get(key).add(i);
				} else {
					List<Integer> value = new ArrayList<>();
					value.add(i);
					minutes.put(key, value);
				}
			}

		}
		List<String> ret = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			if (hours.containsKey(i) && minutes.containsKey(num - i)) {
				for (Integer hour : hours.get(i)) {
					for (Integer minute : minutes.get(num - i)) {
						ret.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
					}
				}

			}
		}
		return ret;
	}

	private int bitCount(int i) {
		return Integer.bitCount(i);
	}
}
