package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _229_MajorityElement2 {

	public List<Integer> majorityElement(int[] nums) {
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int i : map.keySet()) {
			if (map.get(i) > n / 3) {
				res.add(i);
			}
		}
		return res;
	}

}
