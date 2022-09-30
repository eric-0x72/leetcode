package contest;

import java.util.Arrays;

public class __SpecialArray {

	public static int specialArray(int[] nums) {

		Arrays.sort(nums);

		int n = nums.length;

		res: for (int i = 0; i <= n; i++) { // find res
			for (int j = 0; j < n; j++) {

				if (i <= nums[j]) {
					if (i == n - j) {
						return i;
					} else {
						continue res;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 4, 3, 0, 4 };
		int res = specialArray(arr);
		// System.out.println(res);

	}

}
