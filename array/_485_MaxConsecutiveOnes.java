package array;

public class _485_MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {

		int ones = 0;
		int res = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ones += 1;
				res = Math.max(ones, res);
			} else {
				ones = 0;
			}
		}
		return res;
	}

}
