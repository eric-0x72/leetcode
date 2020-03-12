package frequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3sum {

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // ������һ�����ظ���
				int l = i + 1;
				int r = nums.length - 1;
				int sum = -nums[i];

				while (r > l) {

					if (nums[l] + nums[r] == sum) {
						res.add(Arrays.asList(nums[i], nums[l], nums[r]));

						// �����ظ���, high and low
						while (l < r && nums[l] == nums[l + 1])
							l++;
						while (l < r && nums[r] == nums[r - 1])
							r--;

						l++;
						r--;
					} else if (nums[l] + nums[r] < sum) {
						while (l < r && nums[l] == nums[l + 1])
							l++;
						l++;
					} else {
						while (l < r && nums[r] == nums[r - 1])
							r--;
						r--;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] a = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> res = threeSum(a);

		System.out.println(res);
	}
}
