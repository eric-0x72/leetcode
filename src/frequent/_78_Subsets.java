package frequent;

import java.util.LinkedList;
import java.util.List;

public class _78_Subsets {

	static boolean[] used;
	static List<List<Integer>> res = new LinkedList<>();

	public static List<List<Integer>> subsets(int[] nums) {

		used = new boolean[nums.length];
		LinkedList<Integer> cur = new LinkedList<>();

		for (int i = 0; i <= nums.length; i++)
			backtrack(nums, 0, cur, i, 0); // start from 0

		return res;
	}

	private static void backtrack(int[] nums, int index, LinkedList<Integer> cur, int k, int start) {

		if (cur.size() == k) {
			res.add((List<Integer>) cur.clone());
			return;
		}

		for (int i = start; i < nums.length; i++) {

			if (!used[i]) {

				used[i] = true; // state
				cur.addLast(nums[i]); // state

				backtrack(nums, index + 1, cur, k, i);

				cur.removeLast(); // restore state
				used[i] = false; // restore state
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 0 };
		List<List<Integer>> res = subsets(a);
		System.out.println(res);
	}
}
