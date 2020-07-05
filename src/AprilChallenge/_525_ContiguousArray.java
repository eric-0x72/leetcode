package AprilChallenge;

import java.util.Arrays;

public class _525_ContiguousArray {

	/**
	 * brute force
	 * 
	 */
	public static int findMaxLength(int[] nums) {
		int n = nums.length;
		int res = 0;

		for (int i = 0; i < n; i++) { // start
			int count = 0;
			for (int j = i; j < n; j++) { // end
				int cur = nums[j];

				if (cur == 0)
					count++;
				else
					count--;

				if (count == 0)
					res = Math.max(res, j - i + 1);
			}
		}
		return res;
	}

	/**
	 * using extra array
	 * 
	 */
	public static int findMaxLength_1(int[] nums) {
		int n = nums.length;

		// count : first occurrence index of count
		int[] arr = new int[2 * n];

		Arrays.fill(arr, -2);
		arr[n] = -1;

		int res = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			count += nums[i] == 0 ? -1 : 1;
			// System.out.println(count);

			int pos = count + n;
			if (arr[pos] >= -1) // visited
				// current position - first count position
				res = Math.max(res, i - arr[pos]);
			else
				arr[pos] = i;
		}

		System.out.println(Arrays.toString(arr));
		return res;
	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 0, 0, 0, 1, 1 }; // n = 8
		int res = findMaxLength_1(a);
		System.out.println("res=" + res);
	}
}
