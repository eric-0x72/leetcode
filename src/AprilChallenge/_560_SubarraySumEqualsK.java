package AprilChallenge;

import java.util.HashMap;

public class _560_SubarraySumEqualsK {

	/**
	 * brute force
	 */
	public int subarraySum_0(int[] nums, int k) {
		int n = nums.length;
		int res = 0;

		for (int i = 0; i < n; i++) {
			int remain = k;

			// starting from i
			for (int j = i; j < n; j++) {
				remain -= nums[j];

				if (remain == 0) {
					res++;
					// not breaking here since count 0
					// break;
				}
			}
		}
		return res;
	}

	/**
	 * using hashmap
	 *
	 * sum[i,j) = sum[0,j) - sum[0,i)
	 * 
	 * the target k: k = sum[0,curSum) - sum[0,curSum-k), the count is equals to the
	 * occurrence of presum
	 */
	public int subarraySum_1(int[] nums, int k) {

		int n = nums.length;
		int res = 0;
		int sum = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			sum += nums[i];

			// presum is number of occurrences of current sum - k
			// sum[0, cursum
			int preSum = sum - k;

			if (map.containsKey(preSum)) {
				res += map.get(preSum);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return res;
	}

}
