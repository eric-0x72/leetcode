package frequent;

import java.util.Arrays;

public class ProduceExceptSelf {

	public static int[] productExceptSelf(int[] nums) {

		int len = nums.length;

		int[] l = new int[len];
		int[] r = new int[len];
		int[] ans = new int[len];

		l[0] = 1;
		for (int i = 1; i < len; i++)
			l[i] = nums[i - 1] * l[i - 1];

		r[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--)
			r[i] = nums[i + 1] * r[i + 1];

		for (int i = 0; i < len; i++)
			ans[i] = l[i] * r[i];

		return ans;
	}

	public static void main(String[] args) {

		int[] res = productExceptSelf(new int[] { 0, 1, 2, 3 });
		System.out.println(Arrays.toString(res));
	}

}
