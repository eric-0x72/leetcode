package binarySearch;

public class _33_SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (target == nums[mid]) {
				return mid;
			}

			// [l, mid] is sorted
			else if (nums[mid] >= nums[l]) {
				// if target in [l, mid)
				if (target < nums[mid] && target >= nums[l])
					r = mid - 1;
				else
					l = mid + 1;
			}

			// [mid, r] is sorted
			else {
				// if target in (mid, r]
				if (target > nums[mid] && target <= nums[r])
					l = mid + 1;
				else
					r = mid - 1;
			}
		} // end while

		return -1;
	}
}
