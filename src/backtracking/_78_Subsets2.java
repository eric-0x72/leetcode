package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * easier solution from leetcode mobile app
 *
 */
public class _78_Subsets2 {

	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> res = new ArrayList<>(); // pass in res by reference

		// new cur is empty list
		backtrack(res, new ArrayList<>(), nums, 0);

		return res;
	}

	private static void backtrack(List<List<Integer>> res, ArrayList<Integer> cur, int[] nums, int start) {
		res.add(new ArrayList<>(cur)); // add the result from previous level

		for (int i = start; i < nums.length; i++) {
			cur.add(nums[i]);

			backtrack(res, cur, nums, i + 1);

			cur.remove(cur.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		List<List<Integer>> res = subsets(a);
		System.out.println(res);
		System.gc();
	}

}
