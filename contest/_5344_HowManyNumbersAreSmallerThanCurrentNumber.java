package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5344_HowManyNumbersAreSmallerThanCurrentNumber {

	public static int[] smallerNumbersThanCurrent(int[] nums) {

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i] && j != i)
					count++;
			}
			res.add(count);
		}

		int[] r = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			r[i] = res.get(i) ;
		}
		return r;
	}

	public static void main(String[] args) {
		int[] a = { 8, 1, 2, 2, 3 };
		int[] res = smallerNumbersThanCurrent(a);
		System.out.println(Arrays.toString(res));
	}
}
