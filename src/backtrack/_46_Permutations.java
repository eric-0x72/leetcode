package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _46_Permutations {

	private ArrayList<List<Integer>> res;
	private boolean[] used;

	public List<List<Integer>> permute(int[] nums) {

		res = new ArrayList<>();
		used = new boolean[nums.length];

		// backtracking here, pass in new cur
		backtrack(nums, 0, new LinkedList<Integer>());

		return res;
	}

	private void backtrack(int[] nums, int index, LinkedList<Integer> cur) {

		if (index == nums.length) {
			res.add((List<Integer>) cur.clone()); // add current solution to res
			return; // return after search done
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			} else {
				// set to used, add to current result
				used[i] = true;
				cur.addLast(nums[i]);

				// backtracking here:
				// after returns to this level, means all following levels are done
				// then must reset state as follows
				backtrack(nums, index + 1, cur);

				// restore to unused, remove from cur
				used[i] = false;
				cur.removeLast();
			}
		}
		return;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 5 };
		List<List<Integer>> res = (new _46_Permutations()).permute(nums);

//		for (List<Integer> li : res)
//			System.out.println(li);
		System.out.println(res);
	}

}
