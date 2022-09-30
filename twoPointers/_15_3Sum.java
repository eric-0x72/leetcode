package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntToDoubleFunction;

public class _15_3Sum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		Arrays.sort(nums);

		for (int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1] - 1) {
				continue;
			}

			int l = i + 1;
			int r = n - 1;
			int sum = -nums[i];

			while (l < r) {
				if (nums[l] + nums[r] == sum) {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));

					while (l < r && nums[l] == nums[l + 1])
						l++;
					while (l < r && nums[r] == nums[r + 1])
						r--;
					l++;
					r--;
				}

				// if less then l++
				else if (nums[l] + nums[r] < sum) {
					l++;
				}

				// if more then r--
				else {
					r--;
				}
			} // end while loop
		} // end for loop
		return res;
	}

	public static void main(String[] args) {
//		int l = 0;
//		int r = 5;
//		while (l < r) {
//			l++;
//		}
//		System.out.println(l);

		System.out.println(Arrays.asList(1, 2, 3, 4));
	}
}
