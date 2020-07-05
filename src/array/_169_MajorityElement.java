package array;

import java.util.Arrays;

public class _169_MajorityElement {

	public int majorityElement(int[] nums) {
		int k = 0;
		int count = 0;

		for (int i : nums) {

			// if cur is same, +1 count
			if (i == k) {
				count++;
			}

			// current i != k
			else if (count >= 1) {
				count--;
			}

			// count == 0
			else {
				k = i;
				count = 1;
			}

		} // end for
		return k;
	}

	// solution from discussion
	public int majorityElement_1(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return nums[len / 2];
	}
}
