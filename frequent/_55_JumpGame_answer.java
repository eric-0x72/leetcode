package frequent;

import java.util.Arrays;

/**
 * @author zwb
 *
 */
class _55_JumpGame_answer {

	// ------------------------ backtracking -------------------------
	public static boolean canJump(int[] nums) {
		return backtrack(0, nums);
	}

	// starting from "pos", see if we can get to the end
	private static boolean backtrack(int cur, int[] nums) {

		if (cur == nums.length - 1) // base case
			return true;

		// the furthest position that we can reach from pos
		int furthest = Math.min(cur + nums[cur], nums.length - 1);

		// next position, [pos+1, furthest]
		for (int next = cur + 1; next <= furthest; next++) {

			// return true if hit the end in the next recursion
			if (backtrack(next, nums) == true)
				return true;
		}
		return false;
	}

	// ------------------------ top down DP -------------------------
	enum Index {
		good, bad, unknown
	}

	private static Index[] memo;

	public static boolean canJump_dp_topdown(int[] nums) {
		memo = new Index[nums.length];

		// initialise memo to unknown
		for (int i = 0; i < memo.length; i++)
			memo[i] = Index.unknown;

		// set last element to good
		memo[memo.length - 1] = Index.good;

		return dp_topdown(0, nums);
	}

	private static boolean dp_topdown(int pos, int[] nums) {
		// the difference between memoised top down DP and Backtracking
		if (memo[pos] != Index.unknown)
			return memo[pos] == Index.good;

		int furthest = Math.min(pos + nums[pos], nums.length - 1);

		for (int nextPos = pos + 1; nextPos <= furthest; nextPos++) {
			if (dp_topdown(nextPos, nums) == true)
				return true;
		}
		memo[pos] = Index.bad;
		return false;
	}

	// ------------------------ bottom up DP -------------------------
	public static boolean canJump_dp_bottomUp(int[] nums) {

		memo = new Index[nums.length];
		// initialise memo to unknown
		for (int i = 0; i < memo.length; i++)
			memo[i] = Index.unknown;

		memo[memo.length - 1] = Index.good; // set last element to good

		for (int i = nums.length - 2; i >= 0; i--) {

			// the furthest position that element i can reach
			int furthest = Math.min(i + nums[i], nums.length - 1);

			// [i+1, furthest] is the interval that element i can reach
			// for (int j = furthest; j >= i + 1; j--), also works but not as efficient,
			// should search from left
			for (int j = i + 1; j <= furthest; j++) {
				if (memo[j].equals(Index.good)) {
					memo[i] = Index.good;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(memo));
		return memo[0] == Index.good;
	}

	// ------------------------ Greedy -------------------------
	public static boolean canJump_greedy(int[] nums) {
		int lastPos = nums.length - 1;

		// from second last position to beginning
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= lastPos) {
				lastPos = i;
			}
		}
		return lastPos == 0;
	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 1, 1, 4 };

		boolean res = canJump_greedy(a);
		System.out.println(res);
	}

}
