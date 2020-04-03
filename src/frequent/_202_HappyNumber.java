package frequent;

import java.util.HashSet;

public class _202_HappyNumber {

	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();

		while (next(n) != 1) {

			if (set.contains(next(n)))
				return false;

			set.add(next(n));

		}
		return true;
	}

	private int next(int cur) {
		int sum = 0;
		while (cur > 0) {
			int d = cur % 10;
			cur /= 10;
			sum += d * d; // add to sum
		}
		return sum;
	}

}
