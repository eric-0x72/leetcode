// package array;
//
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.PriorityQueue;
//
// public class __temp1 {
//
// 	// TLE
// 	// note that using long as res and mod, due to overflow
// 	public int maxSumRangeQuery(int[] nums, int[][] requests) {
// 		int n = nums.length;
// 		Arrays.sort(nums);
//
// 		HashMap<Integer, Integer> map = new HashMap<>();
//
// 		for (int i = 0; i < n; i++) {
// 			map.put(i, 0);
// 		}
//
// 		for (int[] request : requests) {
// 			int start = request[0], end = request[1];
//
// 			for (int i = start; i <= end; i++) {
// 				map.put(i, map.getOrDefault(i, 0) + 1);
// 			}
// 		}
//
// 		// desc queue, contains
// 		PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
// 		for (int key : map.keySet()) {
// 			q.add(new int[] { key, map.get(key) });
// 		}
//
// 		long res = 0, mod = (long) 1e9 + 7;
// 		int k = n - 1;
// 		while (!q.isEmpty()) {
// 			res += nums[k--] * q.poll()[1];
// 		}
// 		return (int) (res % mod);
// 	}
//
// 	// https://leetcode.com/problems/maximum-sum-obtained-of-any-permutation/discuss/854206/JavaC%2B%2BPython-Sweep-Line
// 	public int maxSumRangeQuery_2(int[] nums, int[][] requests) {
//
// 	}
//
// 	public static void main(String[] args) {
// 		int[][] requests = { { 0, 2 }, { 1, 3 }, { 1, 1 } };
// 		int[] nums = { 1, 2, 3, 4, 5, 10 };
//
// 		int res = maxSumRangeQuery(nums, requests);
// 		System.out.println(res);
//
// 	}
//
// }
