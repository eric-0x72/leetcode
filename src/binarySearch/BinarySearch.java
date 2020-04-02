package binarySearch;

/**
 * @author weibang
 * 
 *         comparing recursive and iterative method
 *
 */
public class BinarySearch {

	public int search1(int[] nums, int target) {
		int l = 0, r = nums.length - 1;

		while (l <= r) {

			int mid = (l + r) / 2;

			if (nums[mid] == target)
				return mid;

			else if (nums[mid] > target) // target is in the left part
				r = mid - 1;
			else
				l = mid + 1;
		}

		return -1;
	}

	public int search2(int[] nums, int target) {
		return helper(nums, target, 0, nums.length - 1);
	}

	private int helper(int[] nums, int target, int l, int r) {
		if (l > r)
			return -1;

		int mid = (l + r) / 2;

		if (nums[mid] == target)
			return mid;

		else if (nums[mid] > target)
			r = mid - 1;
		else
			l = mid + 1;

		return helper(nums, target, l, r);

	}

}
