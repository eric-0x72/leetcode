package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442_FindAllDuplicatesInArray {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();

		for (int num : nums) {
			if (nums[Math.abs(num) - 1] < 0) {
				res.add(Math.abs(num));
			}
			nums[Math.abs(num) - 1] *= -1;
		}
		return res;
	}

	public static void main(String[] args) {
		findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
	}
}
