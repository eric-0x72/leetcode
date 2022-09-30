package binarySearch;

public class _35_SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {

		int l = 0;
		int r = nums.length - 1;

		int mid = l;

		while (l <= r) {

			mid = (l + r) / 2;

			if (target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		} // end while

		int res = mid;

		if (nums[mid] > target) {
			// nothing
		} else {
			res++;
		}
		return res;
	}
}
