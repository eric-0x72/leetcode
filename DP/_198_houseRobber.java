package dp;

import java.util.Arrays;

public class _198_houseRobber {

	private int[] memo;

	// �ݹ飬���仯���� recursive solution
	public int rob_r(int[] nums) {
		memo = new int[nums.length];
		Arrays.fill(nums, -1);

		return tryRob_r(nums, 0);
	}

	// �������� [index ... n) �����Χ������з���
	private int tryRob_r(int[] nums, int index) {
		if (index >= nums.length)
			return 0;
		if (memo[index] != -1)
			return memo[index];

		int res = 0;
		for (int i = index; i < nums.length; i++)
			res = Math.max(res, nums[i] + tryRob_r(nums, i + 2));

		return res;
	}

	public int rob_dp(int[] nums) {

		int n = nums.length;

		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		// ��ͷ��ʼ���? memo
		// memo�������� [0,n) ���ӵõ����������?
		int[] memo = new int[n];
		memo[0] = nums[0];
		memo[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < n; i++)
			memo[i] = Math.max(memo[i - 2] + nums[i], memo[i - 1]);

		return memo[n - 1];
	}

	public static void main(String[] args) {

	}
}
