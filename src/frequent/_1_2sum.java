package frequent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_2sum {

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			hm.put(nums[i], i);

		for (int i = 0; i < nums.length; i++) {
			int other = target - nums[i];
			if (hm.containsKey(other) && hm.get(other) != i)
				return new int[] { i, hm.get(other) };
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 4 };
		int[] res = twoSum(a, 6);
		System.out.println(Arrays.toString(res));
	}
}
