package backtrack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _401_BinaryWatch {

	private static final int[] values = new int[] { 1, 2, 4, 8, 16, 32 };

	private static Map<Integer, Set<String>> hours = new HashMap<>();
	private static Map<Integer, Set<String>> mins = new HashMap<>();

	private static boolean[] hourFlags = new boolean[4];
	private static boolean[] minFlags = new boolean[6];

	private static final void dfsHour(int remain, int sum, Set<String> set) {
//		int[] temp = new int[hourFlags.length];
//		for (int k = 0; k < hourFlags.length; k++)
//			if (hourFlags[k] == true)
//				temp[k] = 1;
//			else
//				temp[k] = 0;

//		System.out.println(Arrays.toString(temp));

		if (remain == 0 && sum < 12)
			set.add(String.valueOf(sum));

		for (int i = 0; i < hourFlags.length; i++) {
			if (!hourFlags[i]) {
				// System.out.println(Arrays.toString(hourFlags));
				hourFlags[i] = true;
				dfsHour(remain - 1, sum + values[i], set);
				hourFlags[i] = false;
			}
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i <= hourFlags.length; i++) {

			Set<String> set = new HashSet<>();
			dfsHour(i, 0, set); // (remain, sum, set) ; sum is the sum of hours; set is stored answer
			hours.put(i, set); // Map<Integer, Set<String>>
		}
		// System.out.println(hours.toString());
	}
}
