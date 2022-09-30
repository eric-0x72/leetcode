package math;

import java.util.Arrays;

public class _204_CountPrimes {

	public int countPrimes(int n) {

		// default is true, all are primes
		boolean[] flag = new boolean[n];
		Arrays.fill(flag, true);

		int res = 0;

		for (int i = 2; i < n; i++) {

			// if i is a prime
			if (flag[i] == true) {
				res++;

				// current prime * j < n, set to not prime
				for (int j = 2; i * j < n; j++) {
					flag[i * j] = false;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		boolean[] a = new boolean[4];
		System.out.println(Arrays.toString(a));
	}
}
