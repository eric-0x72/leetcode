package binarySearch;

public class _81_SearchInRotatedSortedArray2 {

	public static boolean search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (target == nums[mid]) {
				return true;
			}

			// need to handle: 1,3,1,1,1
			// trim same element from both sides, change to 3,1
			while (nums[l] == nums[mid] && l != mid)
				l++;
			while (nums[mid] == nums[r] && mid != r)
				r--;

			// [l, mid] is sorted
			if (nums[mid] >= nums[l]) {

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

		return false;
	}

	public static void main(String[] args) {
		int[] a = { 3, 1 };

		boolean res = search(a, 1);
		System.out.println(res);

	}
}
