package binarySearch;

public class _153_FindMinInRotatedSortedArray {

	// dead end solution by myself
	public static int findMin(int[] nums) {
		int l = 0;
		int r = nums.length - 1;

		int first = nums[l];

		while (l <= r) {

			int mid = (l + r) / 2;

			if (nums[mid] < first) {
				r = mid;
			}

			else if (nums[mid] >= first) {
				if (l == r) {
					return nums[mid];
				}

				l = mid + 1;
				first = nums[l];
			}
		} // end while

		return -1;
	}

	/**
	 * learned from post
	 */
	public static int findMin_1(int[] nums) {
		int l = 0, r = nums.length - 1;

		while (l < r) { // [l, r)
			int mid = (l + r) / 2;

			if (nums[mid] < nums[r])
				r = mid; // exclude mid

			else // if mid >= r
				l = mid + 1;
		}
		return nums[l];
	}

	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 7, 0, 1, 2 };
		int res = findMin(a);
		System.out.println(res);
	}
}
