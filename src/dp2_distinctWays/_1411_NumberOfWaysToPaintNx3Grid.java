package dp2_distinctWays;

public class _1411_NumberOfWaysToPaintNx3Grid {

	public int numOfWays(int n) {
		long a121 = 6;
		long a123 = 6;
		long b121, b123;
		long mod = (long) (1e9 + 7);

		// n-1 times
		for (int i = 1; i < n; i++) {
			b121 = a121 * 3 + a123 * 2;
			b123 = a121 * 2 + a123 * 2;

			a121 = b121 % mod;
			a123 = b123 % mod;

		}
		return (int) ((a121 + a123) % mod);

	}

}
