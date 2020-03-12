package frequent;

public class _55_JumpGame {

	// ----------- backtrack -------------------------
	// starting from cur, we see if can reach the last element
	private boolean backtrack(int curPos, int[] nums) {
		if (curPos == nums.length)
			return true;

		int far = Math.max(curPos + nums[curPos], nums.length);

		for (int nextPos = curPos; nextPos < far; nextPos++) {
			boolean bool = backtrack(nextPos, nums);
			if (bool)
				return true;
		}
		return false; // if cannot find in this level, return(backtrack) to previous level forloop
	}

	public boolean canJump(int[] nums) {
		return backtrack(0, nums);
	}

	// ----------- dp top down -------------------------

	public static void main(String[] args) {

	}

}
