package frequent;

import java.util.HashSet;

public class _202_HappyNumber {

<<<<<<< HEAD
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
=======
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();

		while (next(n) != 1) {

			if (set.contains(next(n)))
				return false;

			set.add(next(n));

>>>>>>> 8cbf096e5d93566322fa25018e56f71c39e01b67
		}
		return true;
	}

<<<<<<< HEAD
	private static int findNext(int cur) {
		int sum = 0;

		while (cur != 0) {
			int digit = cur % 10;
			sum += Math.pow(digit, 2);
			cur /= 10;
=======
	private int next(int cur) {
		int sum = 0;
		while (cur > 0) {
			int d = cur % 10;
			cur /= 10;
			sum += d * d; // add to sum
>>>>>>> 8cbf096e5d93566322fa25018e56f71c39e01b67
		}
		return sum;
	}

<<<<<<< HEAD
	public static void main(String[] args) {
		boolean res = isHappy(19);
		System.out.println(res);
	}
=======
>>>>>>> 8cbf096e5d93566322fa25018e56f71c39e01b67
}
