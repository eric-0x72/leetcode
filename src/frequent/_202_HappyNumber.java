package frequent;

import java.util.HashSet;

public class _202_HappyNumber {

	public static boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		int temp = findNext(n);

		while (temp != 1) {
			temp = findNext(n);

			if (set.contains(temp)) {
				return false;
			} else {
				set.add(temp);
				n = findNext(n);
			}
		}
		return true;
	}

	private static int findNext(int cur) {
		int sum = 0;

		while (cur != 0) {
			int digit = cur % 10;
			sum += Math.pow(digit, 2);
			cur /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		boolean res = isHappy(19);
		System.out.println(res);
	}
}
