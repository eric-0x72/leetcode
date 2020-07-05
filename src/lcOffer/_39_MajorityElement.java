package lcOffer;

import java.util.Arrays;

public class _39_MajorityElement {

	public int majorityElement(int[] nums) {

		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public int majorityElement2(int[] nums) {

		int mode = 0;
		int vote = 0;

		for (int cur : nums) {
			if (vote == 0)
				mode = cur;

			// if current num == mode, then vote add 1; if not then -1
			vote += (cur == mode ? 1 : -1);
		}
		return mode;
	}

}
