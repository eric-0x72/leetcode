package swardOffer;

import java.util.HashSet;

public class _3_RepeatNumbers {

	public int findRepeatNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : nums) {
			if (set.contains(num))
				return num;
			else
				set.add(num);

		}
		return -1;
	}
}
