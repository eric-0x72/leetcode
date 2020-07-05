package lcOffer;

import java.util.Arrays;
import java.util.HashMap;

import jdk.tools.jimage.resources.jimage;

public class _56b_SingleNumber {

	public int singleNumber(int[] nums) {
		Arrays.sort(nums);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		return -1;
	}

}
