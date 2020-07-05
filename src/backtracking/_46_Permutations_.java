package backtracking;

import java.util.ArrayList;
import java.util.List;

// time complexity: 

public class _46_Permutations_ {

	List<List<Integer>> res;
	boolean[] visited;

	public List<List<Integer>> permute(int[] nums) {

		visited = new boolean[nums.length];
		res = new ArrayList<>();

		backtrack(nums, new ArrayList<>());

		return res;
	}

	private void backtrack(int[] nums, ArrayList<Integer> level) {

		if (level.size() == nums.length) {
			// must note here, if not add level.clone()
			// then remains the same object as the original (reference)
			// which gives empty when it all clear out
			// we must instantiate new objects on the heap and
			// add their addresses to res
			res.add((List<Integer>) level.clone());
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (!visited[i]) {
				level.add(nums[i]);
				visited[i] = true;

				backtrack(nums, level);

				level.remove(level.size() - 1);
				visited[i] = false;
			}
		} // end for

	}
}
