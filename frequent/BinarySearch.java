package frequent;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] nums, int target) {

		int l = 0, r = nums.length - 1;

		while (r >= l) {
			int mid = (l + r) / 2;
			int value = nums[mid];

			if (value == target)
				return mid;
			else if (value > target)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 7, 8, 9, 12, 17 };
		int res = binarySearch(a, 18);
		System.out.println(res);
	}
}
