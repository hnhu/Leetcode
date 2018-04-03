package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

 Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

 Example:
 Input:
 [[0,0],[1,0],[2,0]]

 Output:
 2

 Explanation:
 The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]*/
public class _447 {

	public int numberOfBoomerangs(int[][] points) {
		int[][] distances = new int[points.length][points.length];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				distances[i][j] = calcDistance(points[i], points[j]);
			}
		}
		int count = 0;
		Map<Integer, Integer> distanceMap = new HashMap<>();
		for (int[] distance : distances) {
			distanceMap.clear();
			for (int i : distance) {
				distanceMap.put(i, distanceMap.containsKey(i) ? distanceMap.get(i) + 1 : 1);
			}
			for (Integer p : distanceMap.values()) {
				if (p != 0) {
					count += p * (p - 1);
				}
			}
		}
		return count;
	}

	private int calcDistance(int[] p1, int[] p2) {
		return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
	}

	public static void main(String... args) {
		_447 test = new _447();
		// int[][] points = new int[][]{
		// {0,0},
		// {1,0},
		// {2,0},
		// };

		// [[3,6],[7,5],[3,5],[6,2],[9,1],[2,7],[0,9],[0,6],[2,6]], should return 10
		int[][] points = new int[][] { { 3, 6 }, { 7, 5 }, { 3, 5 }, { 6, 2 }, { 9, 1 }, { 2, 7 }, { 0, 9 }, { 0, 6 }, { 2, 6 }, };

		// [[0,0],[1,0],[-1,0],[0,1],[0,-1]] should return 20
		System.out.println(test.numberOfBoomerangs(points));
	}
}
