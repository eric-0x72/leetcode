package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _78_Subsets {

	private boolean[] used;
	private List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		used = new boolean[nums.length];
		LinkedList<Integer> cur = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {
			// index=0
			// size=i
			// start=0
			backtrack(nums, 0, cur, i, 0);
		}
		return res;
	}

	private void backtrack(int[] nums, int index, LinkedList<Integer> cur, int size, int start) {

		if (cur.size() == size) {
			res.add(cur); // (List<Integer>) cur.clone()
			return;
		}

		for (int i = start; i < nums.length; i++) { // i=start
			if (used[i])
				continue;
			else {
				used[i] = true;
				cur.addLast(nums[i]);

				// index+=1, cur, size no change, start=i
				// start = i means, starting from i, do recursion
				backtrack(nums, index + 1, cur, size, i);

				cur.removeLast();
				used[i] = false;
			}
		}
	}

}
