package binarySearch;

public class __BinarySearch {

	// interval [l, r]
	int binarySearch_0(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1; // note

		while (l <= r) {
			int mid = l + (r - l) / 2;

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				l = mid + 1; // note
			else
				r = mid - 1; // note
		}
		return -1;
	}

	// interval [l, r)
	int binarySearch_1(int[] nums, int target) {
		int l = 0, r = nums.length; // [l, r) r is not included

		while (l < r) { // last case is [l, l+1), so l itself
			int mid = l + (r - l) / 2;

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				l = mid + 1; // [mid+1, r)
			else
				r = mid; // [l, mid), same as [l, mid-1]
		}
		return -1;
	}

	// find the LEFT BOUND of target
	// search interval is [l,r)
	// https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/solution/er-fen-cha-zhao-suan-fa-xi-jie-xiang-jie-by-labula/
	int left_bound(int[] nums, int target) {
		if (nums.length == 0)
			return -1;

		int l = 0;
		int r = nums.length; // [0, n)

		// note for a right open interval, the while condition is always <
		while (l < r) {
			int mid = (l + r) / 2;

			if (nums[mid] == target) {
				r = mid; // exclude mid, continue search in the left
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				// if mid > target, set r=mid excludes mid
				r = mid;
			}
		}
		// left means: number of elements smaller than target!!
		// target greater than all numbers
		if (l == nums.length)
			return -1;
		//
		return nums[l] == target ? l : -1;
	}

}
