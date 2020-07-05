package lcOffer;

public class _53_FindFrequencyInSortedArray {

	public int search(int[] nums, int target) {

	}

	private int getFirstK(int[] nums, int target, int l, int r) {
		if (l > r)
			return -1;

		int midIndex = (l + r) / 2;
		int mid = nums[midIndex];

		if (mid > target) { // target is in left part
			return getFirstK(nums, target, l, midIndex - 1);
		} else if (mid < target) { // target is in right part
			return getFirstK(nums, target, midIndex + 1, r);
		} else { // mid == target
			if ((midIndex > 0 && nums[midIndex - 1] != target) || midIndex == 0) {
				return midIndex;
			} else {
				return getFirstK(nums, target, l, midIndex - 1); // find target in left part
			}
		}
		return getFirstK(nums, target, l, r);
	}

}
