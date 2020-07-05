package backtracking;

import java.util.ArrayList;
import java.util.List;

public class _60_PermuationSequence {

	public String getPermutation(int n, int k) {

		List<Integer> nums = new ArrayList<>();

		int[] factorial = new int[n + 1];
		StringBuilder sb = new StringBuilder();

		int sum = 1;
		factorial[0] = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
			factorial[i] = sum;
		}
		// factorial = [1, 1, 2, 6, ... n!]
		// factorial = [0!, 1!, 2!, ... , n!]

		for (int i = 1; i <= n; i++) {
			nums.add(i);
		}

		k--;

		for (int i = 1; i < factorial.length; i++) {
			int index = k / factorial[n - i];
			sb.append(String.valueOf(nums.get(index)));

			nums.remove(index);
			k -= index * factorial[n - i];
		}
		return String.valueOf(sb);
	}

}
