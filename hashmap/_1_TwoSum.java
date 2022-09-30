package hashmap;

import java.util.HashMap;

public class _1_TwoSum {

	public int[] twoSum(int[] nums, int target) {

		int[] res = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			
			int remain = target - nums[i];
			
			if (map.containsKey(remain)) {
				res[0] = i;
				res[1] = map.get(remain); // get the index of remain
				break;
			}

			map.put(nums[i], i);
		}
		return res;
	}
}
