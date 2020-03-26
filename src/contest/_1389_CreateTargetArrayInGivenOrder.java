package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1389_CreateTargetArrayInGivenOrder {

	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> res = new ArrayList<Integer>();

		List<Stack<Integer>> li = new ArrayList<>(nums.length);

		for (int i = 0; i < nums.length; i++) {
			li.add(new Stack<Integer>());
		}

		for (int i = 0; i < nums.length; i++) {
			Stack<Integer> s = li.get(index[i]);
			s.push(nums[i]);
			li.set(i, s); // modify element
		}

		for (int i = 0; i < nums.length; i++) {
			Stack<Integer> s = li.get(index[i]);

			while (!s.isEmpty()) {
				res.add(s.pop());
			}

		}

		int[] res1 = new int[li.size()];
		for (int i = 0; i < res.size(); i++) {
			res1[i] = res.get(i);
		}
		return res1;
	}

}
