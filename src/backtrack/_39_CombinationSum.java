package backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _39_CombinationSum {

	static List<List<Integer>> res;

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		res = new ArrayList<List<Integer>>();
		backtrack(candidates, 0, target, new LinkedList<Integer>());
		return res;
	}

	private static void backtrack(int[] nums, int start, int remains, LinkedList<Integer> cur) {
		if (remains < 0)
			return;

		if (remains == 0) {
			res.add((List<Integer>) cur.clone()); // new LinkedList<>(cur);
			return;
		}

		for (int i = start; i < nums.length; i++) {
			cur.add(nums[i]);
			backtrack(nums, i, remains - nums[i], cur); // not i+1, need reuse!!
			cur.removeLast();
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 6, 7 };
//		int[] a = { 4, 4, 1, 7 };
		List<List<Integer>> res = combinationSum(a, 7);

		System.out.println(res);
	}

}
