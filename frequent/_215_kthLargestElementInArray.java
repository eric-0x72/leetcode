package frequent;

import java.util.Arrays;

public class _215_kthLargestElementInArray {

	public int findKthLargest(int[] nums, int k) {

		Arrays.sort(nums);
		return nums[nums.length - k];

	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 7, 0 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
