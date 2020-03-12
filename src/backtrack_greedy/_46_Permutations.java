package backtrack_greedy;

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

		LinkedList<Integer> p = new LinkedList<>();

		backtrack(nums, 0, p); // backtracking here
		return res;
	}

	@SuppressWarnings("unchecked")
	private void backtrack(int[] nums, int index, LinkedList<Integer> p) {

		if (index == nums.length) {
			res.add((List<Integer>) p.clone());
			// System.out.println("res = " + res);
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (!used[i]) {
				used[i] = true;
				p.addLast(nums[i]);

				backtrack(nums, index + 1, p); // backtracking

				int a = p.removeLast(); // remove p element
//				System.out.println("removed last : " + a);
//
//				System.out.println("before reset used : " + Arrays.toString(used));

				used[i] = false; // restore used
				System.out.println("after reset used : " + Arrays.toString(used));
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
