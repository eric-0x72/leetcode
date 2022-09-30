package math;

import java.util.Arrays;
import java.util.Comparator;

public class _179_LargestNumber {

	private class MyComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {

			String s1 = a + b;
			String s2 = b + a;

			// sort descending
			// if s2 value is greater, then put b in front
			return s2.compareTo(s1);
		}
	}

	public String largestNumber(int[] nums) {
		int n = nums.length;

		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(str, new MyComparator());

		// if the largest number is zero, then return 0
		if (str[0].equals("0"))
			return "0";

		String res = "";
		for (String i : str) {
			res += i;
		}
		return res;
	}

}