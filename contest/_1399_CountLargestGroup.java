package contest;

import java.util.HashMap;

public class _1399_CountLargestGroup {

	public static int countLargestGroup(int n) {
		int maxcount = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			int sum = sumDigits(i);
			map.put(sum, map.getOrDefault(sum, 0) + 1);

			maxcount = Math.max(maxcount, map.get(sum));
		}
		System.out.println(maxcount);
		int res = 0;
		for (int k : map.keySet()) {
			if (map.get(k) == maxcount)
				res++;
		}

		// System.out.println(map);
		return res;
	}

	private static int sumDigits(int n) {
		int res = 0;
		while (n != 0) {
			res += n % 10;
			n /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int res = countLargestGroup(13);
		System.out.println(res);
	}
}
